.class public final synthetic LYue/ۥ۠ۡۧۡ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۠ۡۧۢ$ۥ۟۟۟۠;

.field public final synthetic ۥ۟۟۠ۤ:Landroid/app/Activity;

.field public final synthetic ۥ۟۟۠ۥ:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x59

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۠ۡۧۢ$ۥ۟۟۟۠;Landroid/app/Activity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۡۧۡ;->ۥۣ۟۟۠:LYue/ۥ۠ۡۧۢ$ۥ۟۟۟۠;

    iput-object p2, p0, LYue/ۥ۠ۡۧۡ;->ۥ۟۟۠ۤ:Landroid/app/Activity;

    iput-object p3, p0, LYue/ۥ۠ۡۧۡ;->ۥ۟۟۠ۥ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
