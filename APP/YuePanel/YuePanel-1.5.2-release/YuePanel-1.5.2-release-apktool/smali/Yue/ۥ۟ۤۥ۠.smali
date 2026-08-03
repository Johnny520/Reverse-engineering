.class public final synthetic LYue/ۥ۟ۤۥ۠;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Z

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۥ:I

.field public final synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۧ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x40e

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LYue/ۥ۟ۤۥ۠;->ۥۣ۟۟۠:Z

    iput-object p2, p0, LYue/ۥ۟ۤۥ۠;->ۥ۟۟۠ۤ:Ljava/lang/String;

    iput p3, p0, LYue/ۥ۟ۤۥ۠;->ۥ۟۟۠ۥ:I

    iput-object p4, p0, LYue/ۥ۟ۤۥ۠;->ۥ۟۟۠ۦ:Ljava/lang/String;

    iput-object p5, p0, LYue/ۥ۟ۤۥ۠;->ۥ۟۟۠ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
