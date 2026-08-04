package com.android.app;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import yyds.AbstractC1340;
import yyds.C0859;
import yyds.C2594;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class CustomConstraintLayout extends AbstractC1340 {
    public CustomConstraintLayout(Context context) {
        super(context);
        this.f6218 = new SparseArray();
        this.f6221 = new ArrayList(4);
        this.f6211 = new C0859();
        this.f6220 = 0;
        this.f6214 = 0;
        this.f6208 = Integer.MAX_VALUE;
        this.f6210 = Integer.MAX_VALUE;
        this.f6217 = true;
        this.f6215 = 257;
        this.f6216 = null;
        this.f6209 = null;
        this.f6207 = -1;
        this.f6212 = new HashMap();
        this.f6219 = new SparseArray();
        this.f6213 = new C2594(this, this);
        m2743(null);
    }

    public CustomConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6218 = new SparseArray();
        this.f6221 = new ArrayList(4);
        this.f6211 = new C0859();
        this.f6220 = 0;
        this.f6214 = 0;
        this.f6208 = Integer.MAX_VALUE;
        this.f6210 = Integer.MAX_VALUE;
        this.f6217 = true;
        this.f6215 = 257;
        this.f6216 = null;
        this.f6209 = null;
        this.f6207 = -1;
        this.f6212 = new HashMap();
        this.f6219 = new SparseArray();
        this.f6213 = new C2594(this, this);
        m2743(attributeSet);
    }
}
