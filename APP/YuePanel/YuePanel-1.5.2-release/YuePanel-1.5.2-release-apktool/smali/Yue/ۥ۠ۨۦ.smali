.class public final synthetic LYue/ۥ۠ۨۦ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroid/content/Context;

.field public final synthetic ۥ۟۟۠ۤ:Landroid/widget/LinearLayout;

.field public final synthetic ۥ۟۟۠ۥ:Landroid/widget/EditText;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x23

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/widget/LinearLayout;Landroid/widget/EditText;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۨۦ;->ۥۣ۟۟۠:Landroid/content/Context;

    iput-object p2, p0, LYue/ۥ۠ۨۦ;->ۥ۟۟۠ۤ:Landroid/widget/LinearLayout;

    iput-object p3, p0, LYue/ۥ۠ۨۦ;->ۥ۟۟۠ۥ:Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public final native onClick(Landroid/view/View;)V
.end method
