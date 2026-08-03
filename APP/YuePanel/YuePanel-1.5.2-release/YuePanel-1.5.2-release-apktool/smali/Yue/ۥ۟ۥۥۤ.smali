.class public final synthetic LYue/ۥ۟ۥۥۤ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۥۥۦ;

.field public final synthetic ۥ۟۟۠ۤ:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1f2

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۥۥۦ;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۥۥۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۥۥۦ;

    iput-object p2, p0, LYue/ۥ۟ۥۥۤ;->ۥ۟۟۠ۤ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
