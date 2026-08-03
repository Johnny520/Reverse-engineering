.class public Lcom/yuexin/panel/ۥ$ۥ$ۥ;
.super Lcom/kongzue/dialogx/interfaces/OnBindView;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuexin/panel/ۥ$ۥ;->ۥ۟۟ۡۡ(Lcom/kongzue/dialogx/dialogs/BottomDialog;Landroid/view/View;)V
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


# instance fields
.field public final synthetic ۥ:Landroid/widget/ProgressBar;

.field public final synthetic ۥ۟:Landroid/widget/ImageView;

.field public final synthetic ۥ۟۟:Lcom/yuexin/panel/ۥ$ۥ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x49

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Lcom/yuexin/panel/ۥ$ۥ;Landroid/view/View;Landroid/widget/ProgressBar;Landroid/widget/ImageView;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x0,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/yuexin/panel/ۥ$ۥ$ۥ;->ۥ۟۟:Lcom/yuexin/panel/ۥ$ۥ;

    iput-object p3, p0, Lcom/yuexin/panel/ۥ$ۥ$ۥ;->ۥ:Landroid/widget/ProgressBar;

    iput-object p4, p0, Lcom/yuexin/panel/ۥ$ۥ$ۥ;->ۥ۟:Landroid/widget/ImageView;

    invoke-direct {p0, p2}, Lcom/kongzue/dialogx/interfaces/OnBindView;-><init>(Landroid/view/View;)V

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
