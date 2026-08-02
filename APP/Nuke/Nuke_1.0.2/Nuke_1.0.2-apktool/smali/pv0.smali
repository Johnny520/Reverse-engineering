.class public final synthetic Lpv0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:Lqv0;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Lqv0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpv0;->h:Lqv0;

    .line 5
    .line 6
    iput p2, p0, Lpv0;->i:I

    .line 7
    .line 8
    iput p3, p0, Lpv0;->j:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lpv0;->h:Lqv0;

    .line 2
    .line 3
    iget v1, p0, Lpv0;->i:I

    .line 4
    .line 5
    iget p0, p0, Lpv0;->j:I

    .line 6
    .line 7
    :try_start_0
    iget-object v2, v0, Lqv0;->D:Lyv0;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-virtual {v2, v1, p0, v3}, Lyv0;->j(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception p0

    .line 15
    sget-object v1, Lcg0;->k:Lcg0;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v1, p0}, Lqv0;->b(Lcg0;Lcg0;Ljava/io/IOException;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    sget-object p0, La83;->a:La83;

    .line 21
    .line 22
    return-object p0
.end method
