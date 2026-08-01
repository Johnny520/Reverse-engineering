.class public final synthetic Lky0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lly0;


# direct methods
.method public synthetic constructor <init>(Lly0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lky0;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lky0;->e:Lly0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lky0;->d:I

    .line 2
    .line 3
    iget-object p0, p0, Lky0;->e:Lly0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lly0;->r:Lpy0;

    .line 9
    .line 10
    iget-object p0, p0, Lpy0;->e:Ldp0;

    .line 11
    .line 12
    invoke-virtual {p0}, Ldp0;->g()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    :goto_0
    int-to-float p0, p0

    .line 17
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :pswitch_0
    iget-object p0, p0, Lly0;->r:Lpy0;

    .line 23
    .line 24
    iget-object p0, p0, Lpy0;->a:Ldp0;

    .line 25
    .line 26
    invoke-virtual {p0}, Ldp0;->g()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    goto :goto_0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
