// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ⁱʾ.CLS359;

public final class CLS514 implements AdapterView.OnItemLongClickListener {
    public final int FLD5063;
    public final Activity FLD5064;
    public final CLS359 FLD5065;

    public CLS514(int v, Activity activity0, CLS359 ⁱˉ0) {
        this.FLD5063 = v;
        this.FLD5065 = ⁱˉ0;
        this.FLD5064 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        Activity activity0 = this.FLD5064;
        CLS359 ⁱˉ0 = this.FLD5065;
        if(this.FLD5063 == 0) {
            ContentValues contentValues0 = (ContentValues)ⁱˉ0.getItem(v);
            if(contentValues0 != null) {
                Intent intent0 = new Intent();
                intent0.putExtra("INTENT_FROMGALLERY", false);
                intent0.putExtra("INTENT_TALKER", contentValues0.getAsString("userName"));
                intent0.putExtra("INTENT_SNS_LOCAL_ID", "sns_table_" + contentValues0.getAsInteger("id"));
                if(!CLS66.MTH1450("sns", ".ui.SnsCommentDetailUI", intent0)) {
                    intent0.setClassName(activity0, CLS27.MTH897("SnsCommentDetailUI"));
                    activity0.startActivity(intent0);
                }
            }
            return true;
        }
        ContentValues contentValues1 = (ContentValues)ⁱˉ0.getItem(v);
        if(contentValues1 != null) {
            Intent intent1 = new Intent();
            intent1.putExtra("INTENT_FROMGALLERY", false);
            intent1.putExtra("INTENT_TALKER", contentValues1.getAsString("userName"));
            intent1.putExtra("INTENT_SNS_LOCAL_ID", "sns_table_" + contentValues1.getAsInteger("id"));
            if(!CLS66.MTH1450("sns", ".ui.SnsCommentDetailUI", intent1)) {
                intent1.setClassName(activity0, CLS27.MTH897("SnsCommentDetailUI"));
                activity0.startActivity(intent1);
            }
        }
        return true;
    }
}

