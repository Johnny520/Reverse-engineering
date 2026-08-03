.class public LYue/ۥ۟ۥۦۢ$ۥ;
.super Lcom/kongzue/dialogx/interfaces/OnBindView;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۥۦۢ;->ۥ۟۟۟ۡ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kongzue/dialogx/interfaces/OnBindView<",
        "Lcom/kongzue/dialogx/dialogs/BottomDialog;",
        ">;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x349

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/kongzue/dialogx/interfaces/OnBindView;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public bridge native synthetic onBind(Ljava/lang/Object;Landroid/view/View;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation
.end method

.method public native ۥ(Lcom/kongzue/dialogx/dialogs/BottomDialog;Landroid/view/View;)V
.end method
