.class public final synthetic Ljn;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lrn$b;

.field public final synthetic f:Lrn$b;

.field public final synthetic g:Lrn$b;


# direct methods
.method public synthetic constructor <init>(Lrn$b;Lrn$b;Lrn$b;I)V
    .locals 0

    .line 1
    iput p4, p0, Ljn;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Ljn;->e:Lrn$b;

    .line 4
    .line 5
    iput-object p2, p0, Ljn;->f:Lrn$b;

    .line 6
    .line 7
    iput-object p3, p0, Ljn;->g:Lrn$b;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ljn;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ljn;->g:Lrn$b;

    .line 7
    .line 8
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 9
    .line 10
    iget-object v1, p0, Ljn;->e:Lrn$b;

    .line 11
    .line 12
    iget-object p0, p0, Ljn;->f:Lrn$b;

    .line 13
    .line 14
    invoke-static {v1, p0, v0, p1}, Lrn;->L0(Lrn$b;Lrn$b;Lrn$b;Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    iget-object v0, p0, Ljn;->g:Lrn$b;

    .line 20
    .line 21
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 22
    .line 23
    iget-object v1, p0, Ljn;->e:Lrn$b;

    .line 24
    .line 25
    iget-object p0, p0, Ljn;->f:Lrn$b;

    .line 26
    .line 27
    invoke-static {v1, p0, v0, p1}, Lrn;->R(Lrn$b;Lrn$b;Lrn$b;Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :pswitch_1
    iget-object v0, p0, Ljn;->g:Lrn$b;

    .line 33
    .line 34
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 35
    .line 36
    iget-object v1, p0, Ljn;->e:Lrn$b;

    .line 37
    .line 38
    iget-object p0, p0, Ljn;->f:Lrn$b;

    .line 39
    .line 40
    invoke-static {v1, p0, v0, p1}, Lrn;->p0(Lrn$b;Lrn$b;Lrn$b;Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lna1;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
