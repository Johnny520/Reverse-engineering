package Yue;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class C6161 {

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۦ$ۥ */
    public static final class C0923 implements InterfaceC7326<MenuItem> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Menu f1870;

        public C0923(Menu menu) {
            this.f1870 = menu;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<MenuItem> iterator() {
            return C6161.m19009(this.f1870);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۦ$ۥ۟ */
    @InterfaceC7507({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n83#2:91\n1#3:92\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n*L\n74#1:91\n74#1:92\n*E\n"})
    public static final class C0924 implements Iterator<MenuItem>, InterfaceC5594 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f15069;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Menu f15070;

        public C0924(Menu menu) {
            this.f15070 = menu;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15069 < this.f15070.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            C8107 c8107;
            Menu menu = this.f15070;
            int i = this.f15069 - 1;
            this.f15069 = i;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                menu.removeItem(item.getItemId());
                c8107 = C8107.f3222;
            } else {
                c8107 = null;
            }
            if (c8107 == null) {
                throw new IndexOutOfBoundsException();
            }
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.f15070;
            int i = this.f15069;
            this.f15069 = i + 1;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static final boolean m2662(@InterfaceC6399 Menu menu, @InterfaceC6399 MenuItem menuItem) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (C5499.m17094(menu.getItem(i), menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m2663(@InterfaceC6399 Menu menu, @InterfaceC6399 InterfaceC5124<? super MenuItem, C8107> interfaceC5124) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            interfaceC5124.invoke(menu.getItem(i));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m19003(@InterfaceC6399 Menu menu, @InterfaceC6399 InterfaceC5138<? super Integer, ? super MenuItem, C8107> interfaceC5138) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            interfaceC5138.invoke(Integer.valueOf(i), menu.getItem(i));
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final MenuItem m19004(@InterfaceC6399 Menu menu, int i) {
        return menu.getItem(i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final InterfaceC7326<MenuItem> m19005(@InterfaceC6399 Menu menu) {
        return new C0923(menu);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m19006(@InterfaceC6399 Menu menu) {
        return menu.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean m19007(@InterfaceC6399 Menu menu) {
        return menu.size() == 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m19008(@InterfaceC6399 Menu menu) {
        return menu.size() != 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Iterator<MenuItem> m19009(@InterfaceC6399 Menu menu) {
        return new C0924(menu);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m19010(@InterfaceC6399 Menu menu, @InterfaceC6399 MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final void m19011(@InterfaceC6399 Menu menu, int i) {
        C8107 c8107;
        MenuItem item = menu.getItem(i);
        if (item != null) {
            menu.removeItem(item.getItemId());
            c8107 = C8107.f3222;
        } else {
            c8107 = null;
        }
        if (c8107 == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
