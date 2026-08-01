.class Lcom/mr/elaris/InAppSettingsInputBarPage$2;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lcom/mr/elaris/InAppSettingsWidgets$CheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsInputBarPage;->showDialog(Lcom/mr/elaris/InAppSettings;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$hidden:[Z

.field final synthetic val$index:I


# direct methods
.method public constructor <init>([ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsInputBarPage$2;->val$hidden:[Z

    .line 2
    .line 3
    iput p2, p0, Lcom/mr/elaris/InAppSettingsInputBarPage$2;->val$index:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onCheckedChange(ZLandroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/mr/elaris/InAppSettingsInputBarPage$2;->val$hidden:[Z

    .line 2
    .line 3
    iget p0, p0, Lcom/mr/elaris/InAppSettingsInputBarPage$2;->val$index:I

    .line 4
    .line 5
    aput-boolean p1, p2, p0

    .line 6
    .line 7
    return-void
.end method
