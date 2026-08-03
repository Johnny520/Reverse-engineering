package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: pb */
/* JADX INFO: loaded from: classes.dex */
public final class C2368pb {

    /* JADX INFO: renamed from: n */
    public static final SparseIntArray f8320n;

    /* JADX INFO: renamed from: a */
    public float f8321a;

    /* JADX INFO: renamed from: b */
    public float f8322b;

    /* JADX INFO: renamed from: c */
    public float f8323c;

    /* JADX INFO: renamed from: d */
    public float f8324d;

    /* JADX INFO: renamed from: e */
    public float f8325e;

    /* JADX INFO: renamed from: f */
    public float f8326f;

    /* JADX INFO: renamed from: g */
    public float f8327g;

    /* JADX INFO: renamed from: h */
    public int f8328h;

    /* JADX INFO: renamed from: i */
    public float f8329i;

    /* JADX INFO: renamed from: j */
    public float f8330j;

    /* JADX INFO: renamed from: k */
    public float f8331k;

    /* JADX INFO: renamed from: l */
    public boolean f8332l;

    /* JADX INFO: renamed from: m */
    public float f8333m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8320n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* JADX INFO: renamed from: a */
    public final void m4796a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0639Ou.f2043j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f8320n.get(index)) {
                case 1:
                    this.f8321a = typedArrayObtainStyledAttributes.getFloat(index, this.f8321a);
                    break;
                case 2:
                    this.f8322b = typedArrayObtainStyledAttributes.getFloat(index, this.f8322b);
                    break;
                case 3:
                    this.f8323c = typedArrayObtainStyledAttributes.getFloat(index, this.f8323c);
                    break;
                case 4:
                    this.f8324d = typedArrayObtainStyledAttributes.getFloat(index, this.f8324d);
                    break;
                case 5:
                    this.f8325e = typedArrayObtainStyledAttributes.getFloat(index, this.f8325e);
                    break;
                case 6:
                    this.f8326f = typedArrayObtainStyledAttributes.getDimension(index, this.f8326f);
                    break;
                case 7:
                    this.f8327g = typedArrayObtainStyledAttributes.getDimension(index, this.f8327g);
                    break;
                case LuaJitConsts.LUA_TTHREAD /* 8 */:
                    this.f8329i = typedArrayObtainStyledAttributes.getDimension(index, this.f8329i);
                    break;
                case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                    this.f8330j = typedArrayObtainStyledAttributes.getDimension(index, this.f8330j);
                    break;
                case 10:
                    this.f8331k = typedArrayObtainStyledAttributes.getDimension(index, this.f8331k);
                    break;
                case 11:
                    this.f8332l = true;
                    this.f8333m = typedArrayObtainStyledAttributes.getDimension(index, this.f8333m);
                    break;
                case 12:
                    this.f8328h = C2411qb.m4850f(typedArrayObtainStyledAttributes, index, this.f8328h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
