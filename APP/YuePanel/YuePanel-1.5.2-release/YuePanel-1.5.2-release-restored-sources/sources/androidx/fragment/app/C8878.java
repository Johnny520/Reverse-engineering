package androidx.fragment.app;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.ۥۣ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8878 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final CopyOnWriteArrayList<C1698> f3830 = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public final FragmentManager f3831;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥۣ۟۟۟$ۥ */
    public static final class C1698 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final FragmentManager.AbstractC8856 f3832;

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean f3833;

        public C1698(@InterfaceC6391 FragmentManager.AbstractC8856 abstractC8856, boolean z) {
            this.f3832 = abstractC8856;
            this.f3833 = z;
        }
    }

    public C8878(@InterfaceC6391 FragmentManager fragmentManager) {
        this.f3831 = fragmentManager;
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4842(@InterfaceC6391 Fragment fragment, @InterfaceC6490 Bundle bundle, boolean z) {
        Fragment fragmentM29815 = this.f3831.m29815();
        if (fragmentM29815 != null) {
            fragmentM29815.getParentFragmentManager().m29814().m4842(fragment, bundle, true);
        }
        for (C1698 c1698 : this.f3830) {
            if (!z || c1698.f3833) {
                c1698.f3832.m4820(this.f3831, fragment, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4843(@InterfaceC6391 Fragment fragment, boolean z) {
        Context contextM15670 = this.f3831.m29812().m15670();
        Fragment fragmentM29815 = this.f3831.m29815();
        if (fragmentM29815 != null) {
            fragmentM29815.getParentFragmentManager().m29814().m4843(fragment, true);
        }
        for (C1698 c1698 : this.f3830) {
            if (!z || c1698.f3833) {
                c1698.f3832.m4821(this.f3831, fragment, contextM15670);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m29965(@InterfaceC6391 Fragment fragment, @InterfaceC6490 Bundle bundle, boolean z) {
        Fragment fragmentM29815 = this.f3831.m29815();
        if (fragmentM29815 != null) {
            fragmentM29815.getParentFragmentManager().m29814().m29965(fragment, bundle, true);
        }
        for (C1698 c1698 : this.f3830) {
            if (!z || c1698.f3833) {
                c1698.f3832.m29890(this.f3831, fragment, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m29966(@InterfaceC6391 Fragment fragment, boolean z) {
        Fragment fragmentM29815 = this.f3831.m29815();
        if (fragmentM29815 != null) {
            fragmentM29815.getParentFragmentManager().m29814().m29966(fragment, true);
        }
        for (C1698 c1698 : this.f3830) {
            if (!z || c1698.f3833) {
                c1698.f3832.m29891(this.f3831, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m29967(@InterfaceC6391 Fragment fragment, boolean z) {
        Fragment fragmentM29815 = this.f3831.m29815();
        if (fragmentM29815 != null) {
            fragmentM29815.getParentFragmentManager().m29814().m29967(fragment, true);
        }
        for (C1698 c1698 : this.f3830) {
            if (!z || c1698.f3833) {
                c1698.f3832.m29892(this.f3831, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m29968(@InterfaceC6391 Fragment fragment, boolean z) {
        Fragment fragmentM29815 = this.f3831.m29815();
        if (fragmentM29815 != null) {
            fragmentM29815.getParentFragmentManager().m29814().m29968(fragment, true);
        }
        for (C1698 c1698 : this.f3830) {
            if (!z || c1698.f3833) {
                c1698.f3832.m29893(this.f3831, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m29969(@InterfaceC6391 Fragment fragment, boolean z) {
        Context contextM15670 = this.f3831.m29812().m15670();
        Fragment fragmentM29815 = this.f3831.m29815();
        if (fragmentM29815 != null) {
            fragmentM29815.getParentFragmentManager().m29814().m29969(fragment, true);
        }
        for (C1698 c1698 : this.f3830) {
            if (!z || c1698.f3833) {
                c1698.f3832.m29894(this.f3831, fragment, contextM15670);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m29970(@InterfaceC6391 Fragment fragment, @InterfaceC6490 Bundle bundle, boolean z) {
        Fragment fragmentM29815 = this.f3831.m29815();
        if (fragmentM29815 != null) {
            fragmentM29815.getParentFragmentManager().m29814().m29970(fragment, bundle, true);
        }
        for (C1698 c1698 : this.f3830) {
            if (!z || c1698.f3833) {
                c1698.f3832.m29895(this.f3831, fragment, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m29971(@InterfaceC6391 Fragment fragment, boolean z) {
        Fragment fragmentM29815 = this.f3831.m29815();
        if (fragmentM29815 != null) {
            fragmentM29815.getParentFragmentManager().m29814().m29971(fragment, true);
        }
        for (C1698 c1698 : this.f3830) {
            if (!z || c1698.f3833) {
                c1698.f3832.m29896(this.f3831, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m29972(@InterfaceC6391 Fragment fragment, @InterfaceC6391 Bundle bundle, boolean z) {
        Fragment fragmentM29815 = this.f3831.m29815();
        if (fragmentM29815 != null) {
            fragmentM29815.getParentFragmentManager().m29814().m29972(fragment, bundle, true);
        }
        for (C1698 c1698 : this.f3830) {
            if (!z || c1698.f3833) {
                c1698.f3832.m29897(this.f3831, fragment, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m29973(@InterfaceC6391 Fragment fragment, boolean z) {
        Fragment fragmentM29815 = this.f3831.m29815();
        if (fragmentM29815 != null) {
            fragmentM29815.getParentFragmentManager().m29814().m29973(fragment, true);
        }
        for (C1698 c1698 : this.f3830) {
            if (!z || c1698.f3833) {
                c1698.f3832.m29898(this.f3831, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m29974(@InterfaceC6391 Fragment fragment, boolean z) {
        Fragment fragmentM29815 = this.f3831.m29815();
        if (fragmentM29815 != null) {
            fragmentM29815.getParentFragmentManager().m29814().m29974(fragment, true);
        }
        for (C1698 c1698 : this.f3830) {
            if (!z || c1698.f3833) {
                c1698.f3832.m29899(this.f3831, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m29975(@InterfaceC6391 Fragment fragment, @InterfaceC6391 View view, @InterfaceC6490 Bundle bundle, boolean z) {
        Fragment fragmentM29815 = this.f3831.m29815();
        if (fragmentM29815 != null) {
            fragmentM29815.getParentFragmentManager().m29814().m29975(fragment, view, bundle, true);
        }
        for (C1698 c1698 : this.f3830) {
            if (!z || c1698.f3833) {
                c1698.f3832.mo29900(this.f3831, fragment, view, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m29976(@InterfaceC6391 Fragment fragment, boolean z) {
        Fragment fragmentM29815 = this.f3831.m29815();
        if (fragmentM29815 != null) {
            fragmentM29815.getParentFragmentManager().m29814().m29976(fragment, true);
        }
        for (C1698 c1698 : this.f3830) {
            if (!z || c1698.f3833) {
                c1698.f3832.m29901(this.f3831, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m29977(@InterfaceC6391 FragmentManager.AbstractC8856 abstractC8856, boolean z) {
        this.f3830.add(new C1698(abstractC8856, z));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m29978(@InterfaceC6391 FragmentManager.AbstractC8856 abstractC8856) {
        synchronized (this.f3830) {
            try {
                int size = this.f3830.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (this.f3830.get(i).f3832 == abstractC8856) {
                        this.f3830.remove(i);
                        break;
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
