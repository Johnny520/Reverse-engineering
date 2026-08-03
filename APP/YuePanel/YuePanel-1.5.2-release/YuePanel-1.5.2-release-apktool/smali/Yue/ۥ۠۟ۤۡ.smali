.class public final synthetic LYue/ۥ۠۟ۤۡ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroid/app/Activity;

.field public final synthetic ۥ۟۟۠ۤ:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x4d

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠۟ۤۡ;->ۥۣ۟۟۠:Landroid/app/Activity;

    iput-object p2, p0, LYue/ۥ۠۟ۤۡ;->ۥ۟۟۠ۤ:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final native onClick(Landroid/view/View;)V
.end method
