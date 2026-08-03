.class public final synthetic LYue/ۥۣۡۧۥ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۥ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x206

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۡۧۥ;->ۥۣ۟۟۠:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۣۡۧۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    iput-object p3, p0, LYue/ۥۣۡۧۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
