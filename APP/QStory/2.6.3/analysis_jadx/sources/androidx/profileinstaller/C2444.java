package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.activity.RunnableC0052;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import p007.C6157;
import p070.C6906;
import p070.InterfaceC6908;
import p086.C7061;
import p086.InterfaceC7060;

/* JADX INFO: renamed from: androidx.profileinstaller.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2444 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f7121;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f7122;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f7123;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f7124;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f7125;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f7126;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Object f7127;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Serializable f7128;

    public C2444(AssetManager assetManager, Executor executor, InterfaceC2440 interfaceC2440, String str, File file) {
        byte[] bArr;
        this.f7126 = false;
        this.f7125 = executor;
        this.f7124 = interfaceC2440;
        this.f7128 = str;
        this.f7121 = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 27:
                    bArr = AbstractC2439.f7102;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC2439.f7103;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = AbstractC2439.f7104;
        }
        this.f7123 = bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C2444 m4590(List list) {
        C2444 c2444 = new C2444((InterfaceC6908) this.f7125, (C6157) this.f7124, (C6906) this.f7123, this.f7126, this, (List) this.f7121);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProtoBuf$TypeParameter protoBuf$TypeParameter = (ProtoBuf$TypeParameter) it.next();
            ((LinkedHashMap) c2444.f7128).put(Integer.valueOf(protoBuf$TypeParameter.getName()), Integer.valueOf(protoBuf$TypeParameter.getId()));
        }
        return c2444;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m4591(int i, Serializable serializable) {
        ((Executor) this.f7125).execute(new RunnableC0052(i, 2, this, serializable));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public FileInputStream m4592(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((InterfaceC2440) this.f7124).mo4168();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Integer m4593(int i) {
        Integer num = (Integer) ((LinkedHashMap) this.f7128).get(Integer.valueOf(i));
        if (num != null) {
            return num;
        }
        C2444 c2444 = (C2444) this.f7122;
        if (c2444 != null) {
            return c2444.m4593(i);
        }
        return null;
    }

    public C2444(InterfaceC6908 interfaceC6908, C6157 c6157, C6906 c6906, boolean z, List list, int i) {
        this(interfaceC6908, c6157, c6906, z, (C2444) null, (i & 32) != 0 ? EmptyList.INSTANCE : list);
    }

    public C2444(InterfaceC6908 interfaceC6908, C6157 c6157, C6906 c6906, boolean z, C2444 c2444, List list) {
        interfaceC6908.getClass();
        c6157.getClass();
        c6906.getClass();
        list.getClass();
        this.f7125 = interfaceC6908;
        this.f7124 = c6157;
        this.f7123 = c6906;
        this.f7126 = z;
        this.f7122 = c2444;
        this.f7121 = list;
        this.f7128 = new LinkedHashMap();
        InterfaceC7060.f18960.getClass();
        this.f7127 = C7061.m12378();
    }
}
