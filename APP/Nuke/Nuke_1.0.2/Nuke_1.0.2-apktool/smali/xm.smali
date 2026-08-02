.class public abstract Lxm;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lmy;

.field public static final b:Lwm;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lw;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lw;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lmy;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lmy;-><init>(Lin0;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lxm;->a:Lmy;

    .line 14
    .line 15
    new-instance v0, Lwm;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lxm;->b:Lwm;

    .line 21
    .line 22
    return-void
.end method
