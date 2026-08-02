.class public final synthetic Lpb;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:Lan;

.field public final synthetic i:J


# direct methods
.method public synthetic constructor <init>(Lan;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpb;->h:Lan;

    .line 5
    .line 6
    iput-wide p2, p0, Lpb;->i:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-wide v0, p0, Lpb;->i:J

    .line 2
    .line 3
    iget-object p0, p0, Lpb;->h:Lan;

    .line 4
    .line 5
    check-cast p0, Lzp2;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lzp2;->b(J)Landroid/graphics/Shader;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
