 /**
     * initialize the tool bar. The tool bar
     * contains the barPanel, the current tile button,
     * the score List field and the meeple num list field.
     *
     * @return the initialized tool bar.
     */
    private JPanel initToolBar() {
       
        tools.setLayout(new BoxLayout(tools, BoxLayout.Y_AXIS));

        JPanel barPanel = initBarPanel();
        tools.add(barPanel);

        curTileButton = new JButton();
        ImageIcon icon = new ImageIcon(
                new BufferedImage(TILE_IMAGE_SIZE, TILE_IMAGE_SIZE, BufferedImage.TYPE_INT_ARGB));
        curTileButton.setIcon(icon);
        resetCurTileButton();
        tools.add(new JLabel("Current Tile:"));
        tools.add(curTileButton);

        scoreTextArea = new JTextArea(TEXT_FIELD_ROW, TEXT_FIELD_COLUMN);
        JLabel scoreBoardLabel = new JLabel("ScoreBoard:");
        tools.add(scoreBoardLabel);
        tools.add(scoreTextArea);

        return tools;
    }
