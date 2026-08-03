.class public final synthetic LYue/ۥۣۢۡۥ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/util/List;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣۢۢۥ;

.field public final synthetic ۥ۟۟۠ۥ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x36d

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;LYue/ۥۣۢۢۥ;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۢۡۥ;->ۥۣ۟۟۠:Ljava/util/List;

    iput-object p2, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۢۢۥ;

    iput-object p3, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
