.class public abstract Lri;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lmy;

.field public static final b:Lmy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc0;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lc0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lmy;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lmy;-><init>(Lxm0;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lri;->a:Lmy;

    .line 14
    .line 15
    sget-object v0, Lqi;->i:Lqi;

    .line 16
    .line 17
    new-instance v1, Lmy;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Lmy;-><init>(Lxm0;)V

    .line 20
    .line 21
    .line 22
    sput-object v1, Lri;->b:Lmy;

    .line 23
    .line 24
    return-void
.end method
