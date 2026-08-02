.class public final Lhm;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lhm;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lhm;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lhm;->a:Lhm;

    .line 7
    .line 8
    return-void
.end method

.method public static a()Luh1;
    .locals 3

    .line 1
    new-instance v0, Lam;

    .line 2
    .line 3
    sget-object v1, Lsn;->n:Lrk;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Lam;-><init>(Lrk;Z)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
