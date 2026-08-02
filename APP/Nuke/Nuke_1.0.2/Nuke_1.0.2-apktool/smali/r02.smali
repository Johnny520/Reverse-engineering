.class public abstract Lr02;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Ltu2;

.field public static final b:Lq02;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhn1;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Lhn1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Ltu2;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Le42;-><init>(Lxm0;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lr02;->a:Ltu2;

    .line 13
    .line 14
    new-instance v0, Lq02;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lr02;->b:Lq02;

    .line 20
    .line 21
    return-void
.end method
