package androidx.activity.result;

/* JADX INFO: compiled from: PickVisualMediaRequest.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m115d2 = {"PickVisualMediaRequest", "Landroidx/activity/result/PickVisualMediaRequest;", "mediaType", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "activity_release"}, m116k = 2, m117mv = {1, 7, 1}, m119xi = 48)
public final class PickVisualMediaRequestKt {
    public static final androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r1) {
            java.lang.String r0 = "mediaType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = new androidx.activity.result.PickVisualMediaRequest$Builder
            r0.<init>()
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setMediaType(r1)
            androidx.activity.result.PickVisualMediaRequest r0 = r0.build()
            return r0
    }

    public static /* synthetic */ androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L8
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r0 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType) r0
        L8:
            androidx.activity.result.PickVisualMediaRequest r0 = PickVisualMediaRequest(r0)
            return r0
    }
}
