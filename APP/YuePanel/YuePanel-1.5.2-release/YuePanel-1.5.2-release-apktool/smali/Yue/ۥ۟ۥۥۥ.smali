.class public final synthetic LYue/ۥ۟ۥۥۥ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Z

.field public final synthetic ۥ۟۟۠ۤ:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1f0

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LYue/ۥ۟ۥۥۥ;->ۥۣ۟۟۠:Z

    iput-object p2, p0, LYue/ۥ۟ۥۥۥ;->ۥ۟۟۠ۤ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
