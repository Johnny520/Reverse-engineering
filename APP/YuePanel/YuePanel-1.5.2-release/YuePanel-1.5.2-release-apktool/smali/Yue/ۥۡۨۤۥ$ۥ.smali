.class public LYue/ۥۡۨۤۥ$ۥ;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۨۤۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥ:Ljava/lang/String;

.field public ۥ۟:Z

.field public ۥ۟۟:Z

.field public ۥ۟۟۟:Ljava/lang/String;

.field public ۥ۟۟۟۟:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟۠:Z

.field public ۥ۟۟۟ۡ:Ljava/lang/String;

.field public ۥ۟۟۟ۢ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1e

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LYue/ۥۡۨۤۥ$ۥ;->ۥ۟۟:Z

    .line 3
    iput-boolean v0, p0, LYue/ۥۡۨۤۥ$ۥ;->ۥ۟۟۟۠:Z

    .line 4
    iput-object p1, p0, LYue/ۥۡۨۤۥ$ۥ;->ۥ:Ljava/lang/String;

    .line 5
    iput-boolean p2, p0, LYue/ۥۡۨۤۥ$ۥ;->ۥ۟:Z

    .line 6
    iput-object p3, p0, LYue/ۥۡۨۤۥ$ۥ;->ۥ۟۟۟ۡ:Ljava/lang/String;

    .line 7
    iput-object p4, p0, LYue/ۥۡۨۤۥ$ۥ;->ۥ۟۟۟ۢ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Class;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p7, p0, LYue/ۥۡۨۤۥ$ۥ;->ۥ۟۟۟:Ljava/lang/String;

    .line 10
    iput-object p6, p0, LYue/ۥۡۨۤۥ$ۥ;->ۥ۟۟۟۟:Ljava/lang/Class;

    .line 11
    iput-object p1, p0, LYue/ۥۡۨۤۥ$ۥ;->ۥ:Ljava/lang/String;

    .line 12
    iput-boolean p2, p0, LYue/ۥۡۨۤۥ$ۥ;->ۥ۟:Z

    .line 13
    iput-object p3, p0, LYue/ۥۡۨۤۥ$ۥ;->ۥ۟۟۟ۡ:Ljava/lang/String;

    .line 14
    iput-object p4, p0, LYue/ۥۡۨۤۥ$ۥ;->ۥ۟۟۟ۢ:Ljava/lang/String;

    .line 15
    iput-boolean p5, p0, LYue/ۥۡۨۤۥ$ۥ;->ۥ۟۟۟۠:Z

    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, LYue/ۥۡۨۤۥ$ۥ;->ۥ۟۟:Z

    return-void
.end method

.method public static native synthetic ۥ(LYue/ۥۡۨۤۥ$ۥ;)Z
.end method


# virtual methods
.method public native ۥ۟()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public native ۥ۟۟()Ljava/lang/String;
.end method

.method public native ۥ۟۟۟()Ljava/lang/String;
.end method

.method public native ۥ۟۟۟۟()Ljava/lang/String;
.end method

.method public native ۥ۟۟۟۠()Ljava/lang/String;
.end method

.method public native ۥ۟۟۟ۡ()Z
.end method

.method public native ۥ۟۟۟ۢ()Z
.end method
