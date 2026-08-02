.class public abstract Lsa2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lmy;

.field public static final b:Lua2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lhn1;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lhn1;-><init>(I)V

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
    sput-object v1, Lsa2;->a:Lmy;

    .line 14
    .line 15
    new-instance v0, Lua2;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    sget-wide v2, Lju;->g:J

    .line 19
    .line 20
    invoke-direct {v0, v2, v3, v1}, Lua2;-><init>(JZ)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lsa2;->b:Lua2;

    .line 24
    .line 25
    return-void
.end method
