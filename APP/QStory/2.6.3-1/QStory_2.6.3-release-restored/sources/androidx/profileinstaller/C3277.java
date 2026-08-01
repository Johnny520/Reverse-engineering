package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.activity.RunnableC0899;
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
import p023.C6986;
import p086.C7735;
import p086.InterfaceC7737;
import p102.C7890;
import p102.InterfaceC7889;

/* JADX INFO: renamed from: androidx.profileinstaller.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3277 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f7466;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f7467;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f7468;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f7469;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f7470;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f7471;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Object f7472;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Serializable f7473;

    public C3277(AssetManager assetManager, Executor executor, InterfaceC3273 interfaceC3273, String str, File file) {
        byte[] bArr;
        this.f7471 = false;
        this.f7470 = executor;
        this.f7469 = interfaceC3273;
        this.f7473 = str;
        this.f7466 = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 27:
                    bArr = AbstractC3272.f7447;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC3272.f7448;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = AbstractC3272.f7449;
        }
        this.f7468 = bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C3277 m5150(List list) {
        C3277 c3277 = new C3277((InterfaceC7737) this.f7470, (C6986) this.f7469, (C7735) this.f7468, this.f7471, this, (List) this.f7466);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProtoBuf$TypeParameter protoBuf$TypeParameter = (ProtoBuf$TypeParameter) it.next();
            ((LinkedHashMap) c3277.f7473).put(Integer.valueOf(protoBuf$TypeParameter.getName()), Integer.valueOf(protoBuf$TypeParameter.getId()));
        }
        return c3277;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m5151(int i, Serializable serializable) {
        ((Executor) this.f7470).execute(new RunnableC0899(i, 2, this, serializable));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public FileInputStream m5152(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((InterfaceC3273) this.f7469).mo4728();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Integer m5153(int i) {
        Integer num = (Integer) ((LinkedHashMap) this.f7473).get(Integer.valueOf(i));
        if (num != null) {
            return num;
        }
        C3277 c3277 = (C3277) this.f7467;
        if (c3277 != null) {
            return c3277.m5153(i);
        }
        return null;
    }

    public C3277(InterfaceC7737 interfaceC7737, C6986 c6986, C7735 c7735, boolean z, List list, int i) {
        this(interfaceC7737, c6986, c7735, z, (C3277) null, (i & 32) != 0 ? EmptyList.INSTANCE : list);
    }

    public C3277(InterfaceC7737 interfaceC7737, C6986 c6986, C7735 c7735, boolean z, C3277 c3277, List list) {
        interfaceC7737.getClass();
        c6986.getClass();
        c7735.getClass();
        list.getClass();
        this.f7470 = interfaceC7737;
        this.f7469 = c6986;
        this.f7468 = c7735;
        this.f7471 = z;
        this.f7467 = c3277;
        this.f7466 = list;
        this.f7473 = new LinkedHashMap();
        InterfaceC7889.f19305.getClass();
        this.f7472 = C7890.m12937();
    }
}
