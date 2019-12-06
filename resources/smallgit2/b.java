 /**
     * initialize the bar panel that contains
     * the current turn text field, the remaining
     * tile num text field, the selectPanel
     * and two buttonPanels. The layout of the
     * bar panel is in y coordinate.
     *
     * @return the initialized bar panel.
     */
    private JPanel initBarPanel() {
        JPanel barPanel = new JPanel();
        barPanel.setLayout(new BoxLayout(barPanel, BoxLayout.Y_AXIS));

        JPanel turnPanel = new JPanel();
        JLabel curTurnLabel = new JLabel("Current turn:");
        currentTurnField = new JTextField(TEXT_FIELD_COLUMN);
        currentTurnField.setLayout(new FlowLayout(FlowLayout.LEFT));
        turnPanel.add(curTurnLabel);
        turnPanel.add(currentTurnField);
        barPanel.add(turnPanel);

        JPanel tileNumPanel = new JPanel();
        JLabel tileNumLabel = new JLabel("Remaining tile:");
        tileNumField = new JTextField(TEXT_FIELD_COLUMN);
        tileNumField.setLayout(new FlowLayout(FlowLayout.LEFT));
        tileNumPanel.add(tileNumLabel);
        tileNumPanel.add(tileNumField);
        barPanel.add(tileNumPanel);

        JPanel selectPanel = initSelectPanel();
        barPanel.add(selectPanel);

        JPanel buttonPanel1 = initButtonPanel1();
        barPanel.add(buttonPanel1);
        JPanel buttonPanel2 = initButtonPanel2();
        barPanel.add(buttonPanel2);
        return barPanel;
    }