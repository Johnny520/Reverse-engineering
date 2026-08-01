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
import p015.C6230;
import p070.C6905;
import p070.InterfaceC6907;
import p086.C7060;
import p086.InterfaceC7059;

/* JADX INFO: renamed from: androidx.profileinstaller.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2444 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f7120;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f7121;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f7122;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f7123;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f7124;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f7125;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Object f7126;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Serializable f7127;

    public C2444(AssetManager assetManager, Executor executor, InterfaceC2440 interfaceC2440, String str, File file) {
        byte[] bArr;
        this.f7125 = false;
        this.f7124 = executor;
        this.f7123 = interfaceC2440;
        this.f7127 = str;
        this.f7120 = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 27:
                    bArr = AbstractC2439.f7101;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC2439.f7102;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = AbstractC2439.f7103;
        }
        this.f7122 = bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C2444 m4580(List list) {
        C2444 c2444 = new C2444((InterfaceC6907) this.f7124, (C6230) this.f7123, (C6905) this.f7122, this.f7125, this, (List) this.f7120);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProtoBuf$TypeParameter protoBuf$TypeParameter = (ProtoBuf$TypeParameter) it.next();
            ((LinkedHashMap) c2444.f7127).put(Integer.valueOf(protoBuf$TypeParameter.getName()), Integer.valueOf(protoBuf$TypeParameter.getId()));
        }
        return c2444;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m4581(int i, Serializable serializable) {
        ((Executor) this.f7124).execute(new RunnableC0052(i, 2, this, serializable));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public FileInputStream m4582(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((InterfaceC2440) this.f7123).mo4159();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Integer m4583(int i) {
        Integer num = (Integer) ((LinkedHashMap) this.f7127).get(Integer.valueOf(i));
        if (num != null) {
            return num;
        }
        C2444 c2444 = (C2444) this.f7121;
        if (c2444 != null) {
            return c2444.m4583(i);
        }
        return null;
    }

    public C2444(InterfaceC6907 interfaceC6907, C6230 c6230, C6905 c6905, boolean z, List list, int i) {
        this(interfaceC6907, c6230, c6905, z, (C2444) null, (i & 32) != 0 ? EmptyList.INSTANCE : list);
    }

    public C2444(InterfaceC6907 interfaceC6907, C6230 c6230, C6905 c6905, boolean z, C2444 c2444, List list) {
        interfaceC6907.getClass();
        c6230.getClass();
        c6905.getClass();
        list.getClass();
        this.f7124 = interfaceC6907;
        this.f7123 = c6230;
        this.f7122 = c6905;
        this.f7125 = z;
        this.f7121 = c2444;
        this.f7120 = list;
        this.f7127 = new LinkedHashMap();
        InterfaceC7059.f18965.getClass();
        this.f7126 = C7060.m12351();
    }
}
