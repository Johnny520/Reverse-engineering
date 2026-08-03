.class public final synthetic LYue/ۥۣۡۧۡ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroid/content/Intent;

.field public final synthetic ۥ۟۟۠ۤ:Landroid/app/Activity;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1cc

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Intent;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۡۧۡ;->ۥۣ۟۟۠:Landroid/content/Intent;

    iput-object p2, p0, LYue/ۥۣۡۧۡ;->ۥ۟۟۠ۤ:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
