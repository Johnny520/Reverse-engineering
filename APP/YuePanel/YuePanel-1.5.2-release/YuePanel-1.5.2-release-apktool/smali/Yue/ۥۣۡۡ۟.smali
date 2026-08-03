.class public final synthetic LYue/ۥۣۡۡ۟;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;


# instance fields
.field public final synthetic ۥ:Lcom/yuexin/panel/ۥ$ۥ;

.field public final synthetic ۥ۟:Landroid/content/Context;

.field public final synthetic ۥ۟۟:Landroid/widget/LinearLayout$LayoutParams;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x176

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/yuexin/panel/ۥ$ۥ;Landroid/content/Context;Landroid/widget/LinearLayout$LayoutParams;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۡۡ۟;->ۥ:Lcom/yuexin/panel/ۥ$ۥ;

    iput-object p2, p0, LYue/ۥۣۡۡ۟;->ۥ۟:Landroid/content/Context;

    iput-object p3, p0, LYue/ۥۣۡۡ۟;->ۥ۟۟:Landroid/widget/LinearLayout$LayoutParams;

    return-void
.end method


# virtual methods
.method public final native onClick(Lcom/kongzue/dialogx/interfaces/BaseDialog;Landroid/view/View;)Z
.end method
