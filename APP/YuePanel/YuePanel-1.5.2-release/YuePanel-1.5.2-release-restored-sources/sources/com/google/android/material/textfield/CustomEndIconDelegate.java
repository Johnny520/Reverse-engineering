package com.google.android.material.textfield;

import Yue.InterfaceC6391;

/* JADX INFO: loaded from: classes.dex */
class CustomEndIconDelegate extends EndIconDelegate {
    public CustomEndIconDelegate(@InterfaceC6391 EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void setUp() {
        this.endLayout.setEndIconOnLongClickListener(null);
    }
}
