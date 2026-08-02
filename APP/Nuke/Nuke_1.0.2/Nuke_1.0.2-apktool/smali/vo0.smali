.class public final Lvo0;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ld43;


# static fields
.field public static final w:Lz8;


# instance fields
.field public final v:Luo0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lz8;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lz8;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lvo0;->w:Lz8;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Luo0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lth1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvo0;->v:Luo0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final r()Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lvo0;->w:Lz8;

    .line 2
    .line 3
    return-object p0
.end method
