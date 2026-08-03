package Yue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۣۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3928 extends AbstractC4662 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Comparator<AbstractC4662> f7526 = new Comparator() { // from class: Yue.ۥ۟ۥۤۢ
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC3928.m11184((AbstractC4662) obj, (AbstractC4662) obj2);
        }
    };

    /* JADX INFO: renamed from: ۥ */
    public final ArrayList<AbstractC4662> f573;

    /* JADX INFO: renamed from: ۥ۟ */
    public final ArrayList<AbstractC4662> f574;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f7527;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f7528;

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۣۤ$ۥ */
    public static final class C0292 extends AbstractC3928 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0292(Collection<AbstractC4662> collection) {
            super(collection);
        }

        public String toString() {
            return C7615.m23819(this.f573, "");
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            for (int i = 0; i < this.f7527; i++) {
                if (!this.f574.get(i).m14004(c4605, c46052)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0292(AbstractC4662... abstractC4662Arr) {
            this(Arrays.asList(abstractC4662Arr));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3928() {
        this.f7527 = 0;
        this.f7528 = 0;
        this.f573 = new ArrayList<>();
        this.f574 = new ArrayList<>();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ int m11184(AbstractC4662 abstractC4662, AbstractC4662 abstractC46622) {
        return abstractC4662.mo11185() - abstractC46622.mo11185();
    }

    @Override // Yue.AbstractC4662
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int mo11185() {
        return this.f7528;
    }

    @Override // Yue.AbstractC4662
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo11186() {
        Iterator<AbstractC4662> it = this.f573.iterator();
        while (it.hasNext()) {
            it.next().mo11186();
        }
        super.mo11186();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m11187(AbstractC4662 abstractC4662) {
        this.f573.set(this.f7527 - 1, abstractC4662);
        m11189();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public AbstractC4662 m11188() {
        int i = this.f7527;
        if (i > 0) {
            return this.f573.get(i - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m11189() {
        this.f7527 = this.f573.size();
        this.f7528 = 0;
        Iterator<AbstractC4662> it = this.f573.iterator();
        while (it.hasNext()) {
            this.f7528 += it.next().mo11185();
        }
        this.f574.clear();
        this.f574.addAll(this.f573);
        Collections.sort(this.f574, f7526);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۣۤ$ۥ۟ */
    public static final class C0293 extends AbstractC3928 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0293(Collection<AbstractC4662> collection) {
            if (this.f7527 > 1) {
                this.f573.add(new C0292(collection));
            } else {
                this.f573.addAll(collection);
            }
            m11189();
        }

        public String toString() {
            return C7615.m23819(this.f573, ", ");
        }

        @Override // Yue.AbstractC4662
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean m14004(C4605 c4605, C4605 c46052) {
            for (int i = 0; i < this.f7527; i++) {
                if (this.f574.get(i).m14004(c4605, c46052)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void m11191(AbstractC4662 abstractC4662) {
            this.f573.add(abstractC4662);
            m11189();
        }

        public C0293(AbstractC4662... abstractC4662Arr) {
            this(Arrays.asList(abstractC4662Arr));
        }

        public C0293() {
        }
    }

    public AbstractC3928(Collection<AbstractC4662> collection) {
        this();
        this.f573.addAll(collection);
        m11189();
    }
}
