.class public final synthetic LYue/ۥۣۢۢۡ;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;


# instance fields
.field public final synthetic ۥ:LYue/ۥۣۣۢۢ;

.field public final synthetic ۥ۟:LYue/ۥۣۢۢۥ;

.field public final synthetic ۥ۟۟:Landroid/widget/Button;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x382

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥۣۣۢۢ;LYue/ۥۣۢۢۥ;Landroid/widget/Button;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۢۢۡ;->ۥ:LYue/ۥۣۣۢۢ;

    iput-object p2, p0, LYue/ۥۣۢۢۡ;->ۥ۟:LYue/ۥۣۢۢۥ;

    iput-object p3, p0, LYue/ۥۣۢۢۡ;->ۥ۟۟:Landroid/widget/Button;

    return-void
.end method


# virtual methods
.method public final native onClick(Lcom/kongzue/dialogx/interfaces/BaseDialog;Landroid/view/View;)Z
.end method
