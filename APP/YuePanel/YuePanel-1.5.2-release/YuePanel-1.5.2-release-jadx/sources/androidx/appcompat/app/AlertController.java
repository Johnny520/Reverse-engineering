package androidx.appcompat.app;

import Yue.C6898;
import Yue.C8273;
import Yue.DialogC3302;
import Yue.InterfaceC6490;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C8754;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class AlertController {

    /* JADX INFO: renamed from: ۥ */
    public final Context f3604;

    /* JADX INFO: renamed from: ۥ۟ */
    public final DialogC3302 f3605;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Window f25616;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int f25617;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public CharSequence f25618;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public CharSequence f25619;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public ListView f25620;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public View f25621;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f25622;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f25623;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int f25624;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f25625;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int f25626;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public Button f25628;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public CharSequence f25629;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Message f25630;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public Drawable f25631;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public Button f25632;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public CharSequence f25633;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Message f25634;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Drawable f25635;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Button f25636;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public CharSequence f25637;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Message f25638;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public Drawable f25639;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public NestedScrollView f25640;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public Drawable f25642;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public ImageView f25643;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public TextView f25644;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public TextView f25645;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public View f25646;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public ListAdapter f25647;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public int f25649;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public int f25650;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public int f25651;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public int f25652;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int f25653;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int f25654;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public boolean f25655;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public Handler f25657;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean f25627 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int f25641 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public int f25648 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public int f25656 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final View.OnClickListener f25658 = new ViewOnClickListenerC1577();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final int f25659;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final int f25660;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public RecycleListView(Context context) {
            this(context, null);
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4592(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f25659, getPaddingRight(), z2 ? getPaddingBottom() : this.f25660);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6898.C6909.f19675);
            this.f25660 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6898.C6909.f19676, -1);
            this.f25659 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6898.C6909.f19677, -1);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$ۥ */
    public class ViewOnClickListenerC1577 implements View.OnClickListener {
        public ViewOnClickListenerC1577() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f25628 || (message3 = alertController.f25630) == null) ? (view != alertController.f25632 || (message2 = alertController.f25634) == null) ? (view != alertController.f25636 || (message = alertController.f25638) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f25657.obtainMessage(1, alertController2.f3605).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$ۥ۟ */
    public class C1578 implements NestedScrollView.InterfaceC8804 {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ View f3606;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ View f3607;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C1578(View view, View view2) {
            this.f3606 = view;
            this.f3607 = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC8804
        /* JADX INFO: renamed from: ۥ */
        public void mo3962(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m28660(nestedScrollView, this.f3606, this.f3607);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$ۥ۟۟, reason: contains not printable characters */
    public class RunnableC8629 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ View f25663;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ View f25664;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC8629(View view, View view2) {
            this.f25663 = view;
            this.f25664 = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m28660(AlertController.this.f25640, this.f25663, this.f25664);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$ۥ۟۟۟, reason: contains not printable characters */
    public class C8630 implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ View f3608;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ View f3609;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C8630(View view, View view2) {
            this.f3608 = view;
            this.f3609 = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m28660(absListView, this.f3608, this.f3609);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$ۥ۟۟۟۟, reason: contains not printable characters */
    public class RunnableC8631 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ View f25667;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ View f25668;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC8631(View view, View view2) {
            this.f25667 = view;
            this.f25668 = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m28660(AlertController.this.f25620, this.f25667, this.f25668);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C8632 {

        /* JADX INFO: renamed from: ۥ */
        public final Context f3610;

        /* JADX INFO: renamed from: ۥ۟ */
        public final LayoutInflater f3611;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Drawable f25671;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public CharSequence f25673;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public View f25674;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public CharSequence f25675;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public CharSequence f25676;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public Drawable f25677;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public DialogInterface.OnClickListener f25678;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public CharSequence f25679;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public Drawable f25680;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public DialogInterface.OnClickListener f25681;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public CharSequence f25682;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public Drawable f25683;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public DialogInterface.OnClickListener f25684;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public DialogInterface.OnCancelListener f25686;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public DialogInterface.OnDismissListener f25687;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public DialogInterface.OnKeyListener f25688;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public CharSequence[] f25689;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public ListAdapter f25690;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public DialogInterface.OnClickListener f25691;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int f25692;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public View f25693;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public int f25694;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public int f25695;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public int f25696;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public int f25697;

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public boolean[] f25699;

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public boolean f25700;

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public boolean f25701;

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public DialogInterface.OnMultiChoiceClickListener f25703;

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public Cursor f25704;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public String f25705;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public String f25706;

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public boolean f25707;

        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public AdapterView.OnItemSelectedListener f25708;

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public InterfaceC8635 f25709;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f25670 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f25672 = 0;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public boolean f25698 = false;

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public int f25702 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        public boolean f25710 = true;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public boolean f25685 = true;

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$ۥ۟۟۟۠$ۥ */
        public class C1579 extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ RecycleListView f25711;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1579(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f25711 = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C8632.this.f25699;
                if (zArr != null && zArr[i]) {
                    this.f25711.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$ۥ۟۟۟۠$ۥ۟ */
        public class C1580 extends CursorAdapter {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final int f25713;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final int f25714;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ RecycleListView f25715;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ AlertController f25716;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1580(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f25715 = recycleListView;
                this.f25716 = alertController;
                Cursor cursor2 = getCursor();
                this.f25713 = cursor2.getColumnIndexOrThrow(C8632.this.f25705);
                this.f25714 = cursor2.getColumnIndexOrThrow(C8632.this.f25706);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f25713));
                this.f25715.setItemChecked(cursor.getPosition(), cursor.getInt(this.f25714) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C8632.this.f3611.inflate(this.f25716.f25652, viewGroup, false);
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$ۥ۟۟۟۠$ۥ۟۟, reason: contains not printable characters */
        public class C8633 implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ AlertController f25718;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public C8633(AlertController alertController) {
                this.f25718 = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C8632.this.f25691.onClick(this.f25718.f3605, i);
                if (C8632.this.f25701) {
                    return;
                }
                this.f25718.f3605.dismiss();
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$ۥ۟۟۟۠$ۥ۟۟۟, reason: contains not printable characters */
        public class C8634 implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ RecycleListView f25720;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ AlertController f25721;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public C8634(RecycleListView recycleListView, AlertController alertController) {
                this.f25720 = recycleListView;
                this.f25721 = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C8632.this.f25699;
                if (zArr != null) {
                    zArr[i] = this.f25720.isItemChecked(i);
                }
                C8632.this.f25703.onClick(this.f25721.f3605, i, this.f25720.isItemChecked(i));
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$ۥ۟۟۟۠$ۥ۟۟۟۟, reason: contains not printable characters */
        public interface InterfaceC8635 {
            /* JADX INFO: renamed from: ۥ */
            void m4595(ListView listView);
        }

        public C8632(Context context) {
            this.f3610 = context;
            this.f3611 = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4593(AlertController alertController) {
            View view = this.f25674;
            if (view != null) {
                alertController.m28672(view);
            } else {
                CharSequence charSequence = this.f25673;
                if (charSequence != null) {
                    alertController.m28677(charSequence);
                }
                Drawable drawable = this.f25671;
                if (drawable != null) {
                    alertController.m28674(drawable);
                }
                int i = this.f25670;
                if (i != 0) {
                    alertController.m28673(i);
                }
                int i2 = this.f25672;
                if (i2 != 0) {
                    alertController.m28673(alertController.m28663(i2));
                }
            }
            CharSequence charSequence2 = this.f25675;
            if (charSequence2 != null) {
                alertController.m28675(charSequence2);
            }
            CharSequence charSequence3 = this.f25676;
            if (charSequence3 != null || this.f25677 != null) {
                alertController.m28670(-1, charSequence3, this.f25678, null, this.f25677);
            }
            CharSequence charSequence4 = this.f25679;
            if (charSequence4 != null || this.f25680 != null) {
                alertController.m28670(-2, charSequence4, this.f25681, null, this.f25680);
            }
            CharSequence charSequence5 = this.f25682;
            if (charSequence5 != null || this.f25683 != null) {
                alertController.m28670(-3, charSequence5, this.f25684, null, this.f25683);
            }
            if (this.f25689 != null || this.f25704 != null || this.f25690 != null) {
                m4594(alertController);
            }
            View view2 = this.f25693;
            if (view2 != null) {
                if (this.f25698) {
                    alertController.m28680(view2, this.f25694, this.f25695, this.f25696, this.f25697);
                    return;
                } else {
                    alertController.m28679(view2);
                    return;
                }
            }
            int i3 = this.f25692;
            if (i3 != 0) {
                alertController.m28678(i3);
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m4594(AlertController alertController) {
            ListAdapter c8637;
            RecycleListView recycleListView = (RecycleListView) this.f3611.inflate(alertController.f25651, (ViewGroup) null);
            if (this.f25700) {
                c8637 = this.f25704 == null ? new C1579(this.f3610, alertController.f25652, R.id.text1, this.f25689, recycleListView) : new C1580(this.f3610, this.f25704, false, recycleListView, alertController);
            } else {
                int i = this.f25701 ? alertController.f25653 : alertController.f25654;
                if (this.f25704 != null) {
                    c8637 = new SimpleCursorAdapter(this.f3610, i, this.f25704, new String[]{this.f25705}, new int[]{R.id.text1});
                } else {
                    c8637 = this.f25690;
                    if (c8637 == null) {
                        c8637 = new C8637(this.f3610, i, R.id.text1, this.f25689);
                    }
                }
            }
            InterfaceC8635 interfaceC8635 = this.f25709;
            if (interfaceC8635 != null) {
                interfaceC8635.m4595(recycleListView);
            }
            alertController.f25647 = c8637;
            alertController.f25648 = this.f25702;
            if (this.f25691 != null) {
                recycleListView.setOnItemClickListener(new C8633(alertController));
            } else if (this.f25703 != null) {
                recycleListView.setOnItemClickListener(new C8634(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f25708;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f25701) {
                recycleListView.setChoiceMode(1);
            } else if (this.f25700) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f25620 = recycleListView;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class HandlerC8636 extends Handler {

        /* JADX INFO: renamed from: ۥ۟ */
        public static final int f3612 = 1;

        /* JADX INFO: renamed from: ۥ */
        public WeakReference<DialogInterface> f3613;

        public HandlerC8636(DialogInterface dialogInterface) {
            this.f3613 = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f3613.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C8637 extends ArrayAdapter<CharSequence> {
        public C8637(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC3302 dialogC3302, Window window) {
        this.f3604 = context;
        this.f3605 = dialogC3302;
        this.f25616 = window;
        this.f25657 = new HandlerC8636(dialogC3302);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C6898.C6909.f19410, C6898.C1110.f18388, 0);
        this.f25649 = typedArrayObtainStyledAttributes.getResourceId(C6898.C6909.f19411, 0);
        this.f25650 = typedArrayObtainStyledAttributes.getResourceId(C6898.C6909.f19413, 0);
        this.f25651 = typedArrayObtainStyledAttributes.getResourceId(C6898.C6909.f19415, 0);
        this.f25652 = typedArrayObtainStyledAttributes.getResourceId(C6898.C6909.f19416, 0);
        this.f25653 = typedArrayObtainStyledAttributes.getResourceId(C6898.C6909.f19418, 0);
        this.f25654 = typedArrayObtainStyledAttributes.getResourceId(C6898.C6909.f19414, 0);
        this.f25655 = typedArrayObtainStyledAttributes.getBoolean(C6898.C6909.f19417, true);
        this.f25617 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6898.C6909.f19412, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogC3302.supportRequestWindowFeature(1);
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m4590(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m4590(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m28660(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static boolean m28661(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C6898.C1110.f18387, typedValue, true);
        return typedValue.data != 0;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m4591(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Button m28662(int i) {
        if (i == -3) {
            return this.f25636;
        }
        if (i == -2) {
            return this.f25632;
        }
        if (i != -1) {
            return null;
        }
        return this.f25628;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m28663(int i) {
        TypedValue typedValue = new TypedValue();
        this.f3604.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public ListView m28664() {
        return this.f25620;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m28665() {
        this.f3605.setContentView(m28669());
        m28685();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m28666(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f25640;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m28667(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f25640;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final ViewGroup m28668(@InterfaceC6490 View view, @InterfaceC6490 View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int m28669() {
        int i = this.f25650;
        return (i != 0 && this.f25656 == 1) ? i : this.f25649;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m28670(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f25657.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f25637 = charSequence;
            this.f25638 = message;
            this.f25639 = drawable;
        } else if (i == -2) {
            this.f25633 = charSequence;
            this.f25634 = message;
            this.f25635 = drawable;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f25629 = charSequence;
            this.f25630 = message;
            this.f25631 = drawable;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m28671(int i) {
        this.f25656 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m28672(View view) {
        this.f25646 = view;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m28673(int i) {
        this.f25642 = null;
        this.f25641 = i;
        ImageView imageView = this.f25643;
        if (imageView != null) {
            if (i == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f25643.setImageResource(this.f25641);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m28674(Drawable drawable) {
        this.f25642 = drawable;
        this.f25641 = 0;
        ImageView imageView = this.f25643;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f25643.setImageDrawable(drawable);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m28675(CharSequence charSequence) {
        this.f25619 = charSequence;
        TextView textView = this.f25645;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m28676(ViewGroup viewGroup, View view, int i, int i2) {
        View viewFindViewById = this.f25616.findViewById(C6898.C6903.f18931);
        View viewFindViewById2 = this.f25616.findViewById(C6898.C6903.f18930);
        C8273.m27483(view, i, i2);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m28677(CharSequence charSequence) {
        this.f25618 = charSequence;
        TextView textView = this.f25644;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m28678(int i) {
        this.f25621 = null;
        this.f25622 = i;
        this.f25627 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m28679(View view) {
        this.f25621 = view;
        this.f25622 = 0;
        this.f25627 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m28680(View view, int i, int i2, int i3, int i4) {
        this.f25621 = view;
        this.f25622 = 0;
        this.f25627 = true;
        this.f25623 = i;
        this.f25624 = i2;
        this.f25625 = i3;
        this.f25626 = i4;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m28681(ViewGroup viewGroup) {
        int i;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f25628 = button;
        button.setOnClickListener(this.f25658);
        if (TextUtils.isEmpty(this.f25629) && this.f25631 == null) {
            this.f25628.setVisibility(8);
            i = 0;
        } else {
            this.f25628.setText(this.f25629);
            Drawable drawable = this.f25631;
            if (drawable != null) {
                int i2 = this.f25617;
                drawable.setBounds(0, 0, i2, i2);
                this.f25628.setCompoundDrawables(this.f25631, null, null, null);
            }
            this.f25628.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f25632 = button2;
        button2.setOnClickListener(this.f25658);
        if (TextUtils.isEmpty(this.f25633) && this.f25635 == null) {
            this.f25632.setVisibility(8);
        } else {
            this.f25632.setText(this.f25633);
            Drawable drawable2 = this.f25635;
            if (drawable2 != null) {
                int i3 = this.f25617;
                drawable2.setBounds(0, 0, i3, i3);
                this.f25632.setCompoundDrawables(this.f25635, null, null, null);
            }
            this.f25632.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f25636 = button3;
        button3.setOnClickListener(this.f25658);
        if (TextUtils.isEmpty(this.f25637) && this.f25639 == null) {
            this.f25636.setVisibility(8);
        } else {
            this.f25636.setText(this.f25637);
            Drawable drawable3 = this.f25639;
            if (drawable3 != null) {
                int i4 = this.f25617;
                drawable3.setBounds(0, 0, i4, i4);
                this.f25636.setCompoundDrawables(this.f25639, null, null, null);
            }
            this.f25636.setVisibility(0);
            i |= 4;
        }
        if (m28661(this.f3604)) {
            if (i == 1) {
                m4591(this.f25628);
            } else if (i == 2) {
                m4591(this.f25632);
            } else if (i == 4) {
                m4591(this.f25636);
            }
        }
        if (i != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m28682(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f25616.findViewById(C6898.C6903.f18932);
        this.f25640 = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f25640.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f25645 = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f25619;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f25640.removeView(this.f25645);
        if (this.f25620 == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f25640.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f25640);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f25620, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m28683(ViewGroup viewGroup) {
        View viewInflate = this.f25621;
        if (viewInflate == null) {
            viewInflate = this.f25622 != 0 ? LayoutInflater.from(this.f3604).inflate(this.f25622, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !m4590(viewInflate)) {
            this.f25616.setFlags(131072, 131072);
        }
        if (!z) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f25616.findViewById(C6898.C6903.f18906);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f25627) {
            frameLayout.setPadding(this.f25623, this.f25624, this.f25625, this.f25626);
        }
        if (this.f25620 != null) {
            ((LinearLayout.LayoutParams) ((C8754.C1632) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m28684(ViewGroup viewGroup) {
        if (this.f25646 != null) {
            viewGroup.addView(this.f25646, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f25616.findViewById(C6898.C6903.f18957).setVisibility(8);
            return;
        }
        this.f25643 = (ImageView) this.f25616.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.f25618)) || !this.f25655) {
            this.f25616.findViewById(C6898.C6903.f18957).setVisibility(8);
            this.f25643.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f25616.findViewById(C6898.C6903.f18900);
        this.f25644 = textView;
        textView.setText(this.f25618);
        int i = this.f25641;
        if (i != 0) {
            this.f25643.setImageResource(i);
            return;
        }
        Drawable drawable = this.f25642;
        if (drawable != null) {
            this.f25643.setImageDrawable(drawable);
        } else {
            this.f25644.setPadding(this.f25643.getPaddingLeft(), this.f25643.getPaddingTop(), this.f25643.getPaddingRight(), this.f25643.getPaddingBottom());
            this.f25643.setVisibility(8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m28685() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f25616.findViewById(C6898.C6903.f18925);
        View viewFindViewById4 = viewFindViewById3.findViewById(C6898.C6903.f18958);
        View viewFindViewById5 = viewFindViewById3.findViewById(C6898.C6903.f18905);
        View viewFindViewById6 = viewFindViewById3.findViewById(C6898.C6903.f18901);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(C6898.C6903.f18907);
        m28683(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(C6898.C6903.f18958);
        View viewFindViewById8 = viewGroup.findViewById(C6898.C6903.f18905);
        View viewFindViewById9 = viewGroup.findViewById(C6898.C6903.f18901);
        ViewGroup viewGroupM28668 = m28668(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM286682 = m28668(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupM286683 = m28668(viewFindViewById9, viewFindViewById6);
        m28682(viewGroupM286682);
        m28681(viewGroupM286683);
        m28684(viewGroupM28668);
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (viewGroupM28668 == null || viewGroupM28668.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (viewGroupM286683 == null || viewGroupM286683.getVisibility() == 8) ? false : true;
        if (!z3 && viewGroupM286682 != null && (viewFindViewById2 = viewGroupM286682.findViewById(C6898.C6903.f18953)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z2 != 0) {
            NestedScrollView nestedScrollView = this.f25640;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f25619 == null && this.f25620 == null) ? null : viewGroupM28668.findViewById(C6898.C6903.f18956);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupM286682 != null && (viewFindViewById = viewGroupM286682.findViewById(C6898.C6903.f18954)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f25620;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m4592(z2, z3);
        }
        if (!z) {
            View view = this.f25620;
            if (view == null) {
                view = this.f25640;
            }
            if (view != null) {
                m28676(viewGroupM286682, view, z2 | (z3 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f25620;
        if (listView2 == null || (listAdapter = this.f25647) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i = this.f25648;
        if (i > -1) {
            listView2.setItemChecked(i, true);
            listView2.setSelection(i);
        }
    }
}
