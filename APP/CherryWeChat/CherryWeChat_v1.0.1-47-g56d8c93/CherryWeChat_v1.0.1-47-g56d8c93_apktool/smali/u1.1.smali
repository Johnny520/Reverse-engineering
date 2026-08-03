.class public final Lu1;
.super Lin;
.source ""


# static fields
.field public static final e:Llu;

.field public static final f:Llu;


# instance fields
.field public final synthetic d:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lr1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr1;-><init>(I)V

    new-instance v1, Llu;

    const-class v2, Lo1;

    invoke-direct {v1, v2, v0}, Llu;-><init>(Ljava/lang/Class;Lr1;)V

    sput-object v1, Lu1;->e:Llu;

    new-instance v0, Lr1;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lr1;-><init>(I)V

    new-instance v1, Llu;

    const-class v2, LDk;

    invoke-direct {v1, v2, v0}, Llu;-><init>(Ljava/lang/Class;Lr1;)V

    sput-object v1, Lu1;->f:Llu;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lu1;->d:I

    .line 2
    new-instance v0, Ls1;

    const-class v1, LUp;

    const/16 v2, 0x8

    .line 3
    invoke-direct {v0, v2, v1}, Ls1;-><init>(ILjava/lang/Class;)V

    .line 4
    filled-new-array {v0}, [Ls1;

    move-result-object v0

    const-class v1, LCk;

    invoke-direct {p0, v1, v0}, Lin;-><init>(Ljava/lang/Class;[Ls1;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;[Ls1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lu1;->d:I

    invoke-direct {p0, p1, p2}, Lin;-><init>(Ljava/lang/Class;[Ls1;)V

    return-void
.end method

.method public static h(II)Lhn;
    .locals 2

    invoke-static {}, LR1;->A()LQ1;

    move-result-object v0

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v1, v0, Ltj;->b:Lvj;

    check-cast v1, LR1;

    invoke-static {v1, p0}, LR1;->x(LR1;I)V

    invoke-static {}, LU1;->z()LT1;

    move-result-object p0

    invoke-virtual {p0}, Ltj;->e()V

    iget-object v1, p0, Ltj;->b:Lvj;

    check-cast v1, LU1;

    invoke-static {v1}, LU1;->w(LU1;)V

    invoke-virtual {p0}, Ltj;->b()Lvj;

    move-result-object p0

    check-cast p0, LU1;

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v1, v0, Ltj;->b:Lvj;

    check-cast v1, LR1;

    invoke-static {v1, p0}, LR1;->w(LR1;LU1;)V

    invoke-virtual {v0}, Ltj;->b()Lvj;

    move-result-object p0

    check-cast p0, LR1;

    new-instance v0, Lhn;

    invoke-direct {v0, p0, p1}, Lhn;-><init>(Lvj;I)V

    return-object v0
.end method

.method public static i(III)Lhn;
    .locals 5

    new-instance v0, Lhn;

    invoke-static {}, LJ1;->B()LI1;

    move-result-object v1

    invoke-static {}, LL1;->z()LK1;

    move-result-object v2

    invoke-virtual {v2}, Ltj;->e()V

    iget-object v3, v2, Ltj;->b:Lvj;

    check-cast v3, LL1;

    invoke-static {v3}, LL1;->w(LL1;)V

    invoke-virtual {v2}, Ltj;->b()Lvj;

    move-result-object v2

    check-cast v2, LL1;

    invoke-virtual {v1}, Ltj;->e()V

    iget-object v3, v1, Ltj;->b:Lvj;

    check-cast v3, LJ1;

    invoke-static {v3, v2}, LJ1;->w(LJ1;LL1;)V

    invoke-virtual {v1}, Ltj;->e()V

    iget-object v2, v1, Ltj;->b:Lvj;

    check-cast v2, LJ1;

    invoke-static {v2, p0}, LJ1;->x(LJ1;I)V

    invoke-virtual {v1}, Ltj;->b()Lvj;

    move-result-object p0

    check-cast p0, LJ1;

    invoke-static {}, LFk;->B()LEk;

    move-result-object v1

    invoke-static {}, LIk;->B()LHk;

    move-result-object v2

    invoke-virtual {v2}, Ltj;->e()V

    iget-object v3, v2, Ltj;->b:Lvj;

    check-cast v3, LIk;

    sget-object v4, Lrk;->e:Lrk;

    invoke-static {v3, v4}, LIk;->w(LIk;Lrk;)V

    invoke-virtual {v2}, Ltj;->e()V

    iget-object v3, v2, Ltj;->b:Lvj;

    check-cast v3, LIk;

    invoke-static {v3, p1}, LIk;->x(LIk;I)V

    invoke-virtual {v2}, Ltj;->b()Lvj;

    move-result-object p1

    check-cast p1, LIk;

    invoke-virtual {v1}, Ltj;->e()V

    iget-object v2, v1, Ltj;->b:Lvj;

    check-cast v2, LFk;

    invoke-static {v2, p1}, LFk;->w(LFk;LIk;)V

    invoke-virtual {v1}, Ltj;->e()V

    iget-object p1, v1, Ltj;->b:Lvj;

    check-cast p1, LFk;

    const/16 v2, 0x20

    invoke-static {p1, v2}, LFk;->x(LFk;I)V

    invoke-virtual {v1}, Ltj;->b()Lvj;

    move-result-object p1

    check-cast p1, LFk;

    invoke-static {}, LD1;->A()LC1;

    move-result-object v1

    invoke-virtual {v1}, Ltj;->e()V

    iget-object v2, v1, Ltj;->b:Lvj;

    check-cast v2, LD1;

    invoke-static {v2, p0}, LD1;->w(LD1;LJ1;)V

    invoke-virtual {v1}, Ltj;->e()V

    iget-object p0, v1, Ltj;->b:Lvj;

    check-cast p0, LD1;

    invoke-static {p0, p1}, LD1;->x(LD1;LFk;)V

    invoke-virtual {v1}, Ltj;->b()Lvj;

    move-result-object p0

    check-cast p0, LD1;

    invoke-direct {v0, p0, p2}, Lhn;-><init>(Lvj;I)V

    return-object v0
.end method

.method public static j(II)Lhn;
    .locals 2

    invoke-static {}, Lb2;->y()La2;

    move-result-object v0

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v1, v0, Ltj;->b:Lvj;

    check-cast v1, Lb2;

    invoke-static {v1, p0}, Lb2;->w(Lb2;I)V

    invoke-virtual {v0}, Ltj;->b()Lvj;

    move-result-object p0

    check-cast p0, Lb2;

    new-instance v0, Lhn;

    invoke-direct {v0, p0, p1}, Lhn;-><init>(Lvj;I)V

    return-object v0
.end method

.method public static k(II)Lhn;
    .locals 2

    invoke-static {}, Lj2;->y()Li2;

    move-result-object v0

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v1, v0, Ltj;->b:Lvj;

    check-cast v1, Lj2;

    invoke-static {v1, p0}, Lj2;->w(Lj2;I)V

    invoke-virtual {v0}, Ltj;->b()Lvj;

    move-result-object p0

    check-cast p0, Lj2;

    new-instance v0, Lhn;

    invoke-direct {v0, p0, p1}, Lhn;-><init>(Lvj;I)V

    return-object v0
.end method

.method public static l(IILrk;I)Lhn;
    .locals 4

    new-instance v0, Lhn;

    invoke-static {}, LFk;->B()LEk;

    move-result-object v1

    invoke-static {}, LIk;->B()LHk;

    move-result-object v2

    invoke-virtual {v2}, Ltj;->e()V

    iget-object v3, v2, Ltj;->b:Lvj;

    check-cast v3, LIk;

    invoke-static {v3, p2}, LIk;->w(LIk;Lrk;)V

    invoke-virtual {v2}, Ltj;->e()V

    iget-object p2, v2, Ltj;->b:Lvj;

    check-cast p2, LIk;

    invoke-static {p2, p1}, LIk;->x(LIk;I)V

    invoke-virtual {v2}, Ltj;->b()Lvj;

    move-result-object p1

    check-cast p1, LIk;

    invoke-virtual {v1}, Ltj;->e()V

    iget-object p2, v1, Ltj;->b:Lvj;

    check-cast p2, LFk;

    invoke-static {p2, p1}, LFk;->w(LFk;LIk;)V

    invoke-virtual {v1}, Ltj;->e()V

    iget-object p1, v1, Ltj;->b:Lvj;

    check-cast p1, LFk;

    invoke-static {p1, p0}, LFk;->x(LFk;I)V

    invoke-virtual {v1}, Ltj;->b()Lvj;

    move-result-object p0

    check-cast p0, LFk;

    invoke-direct {v0, p0, p3}, Lhn;-><init>(Lvj;I)V

    return-object v0
.end method

.method public static m(Ly1;)V
    .locals 2

    invoke-virtual {p0}, Ly1;->y()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Ly1;->y()I

    move-result p0

    const/16 v0, 0x10

    if-gt p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too long"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too short"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static n(LIk;)V
    .locals 3

    invoke-virtual {p0}, LIk;->A()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_a

    invoke-virtual {p0}, LIk;->z()Lrk;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    const-string v2, "tag size too big"

    if-eq v0, v1, :cond_8

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, LIk;->A()I

    move-result p0

    const/16 v0, 0x1c

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown hash type"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-virtual {p0}, LIk;->A()I

    move-result p0

    const/16 v0, 0x40

    if-gt p0, v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    invoke-virtual {p0}, LIk;->A()I

    move-result p0

    const/16 v0, 0x20

    if-gt p0, v0, :cond_5

    goto :goto_0

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {p0}, LIk;->A()I

    move-result p0

    const/16 v0, 0x30

    if-gt p0, v0, :cond_7

    goto :goto_0

    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    invoke-virtual {p0}, LIk;->A()I

    move-result p0

    const/16 v0, 0x14

    if-gt p0, v0, :cond_9

    :goto_0
    return-void

    :cond_9
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too small"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lu1;->d:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-super {p0}, Lin;->a()I

    move-result v0

    return v0

    :pswitch_1
    const/4 v0, 0x2

    return v0

    :pswitch_2
    const/4 v0, 0x2

    return v0

    :pswitch_3
    const/4 v0, 0x2

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lu1;->d:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    return-object v0

    :pswitch_0
    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    return-object v0

    :pswitch_1
    const-string v0, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    return-object v0

    :pswitch_2
    const-string v0, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    return-object v0

    :pswitch_3
    const-string v0, "type.googleapis.com/google.crypto.tink.AesSivKey"

    return-object v0

    :pswitch_4
    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    return-object v0

    :pswitch_5
    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    return-object v0

    :pswitch_6
    const-string v0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    return-object v0

    :pswitch_7
    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    return-object v0

    :pswitch_8
    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    return-object v0

    :pswitch_9
    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Lv5;
    .locals 3

    iget v0, p0, Lu1;->d:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lt1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lt1;-><init>(Lu1;BS)V

    return-object v0

    :pswitch_0
    new-instance v0, Lt1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lt1;-><init>(Lu1;BI)V

    return-object v0

    :pswitch_1
    new-instance v0, Lt1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lt1;-><init>(Lu1;BC)V

    return-object v0

    :pswitch_2
    new-instance v0, Lt1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lt1;-><init>(Lu1;BZ)V

    return-object v0

    :pswitch_3
    new-instance v0, Lt1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lt1;-><init>(Lu1;S)V

    return-object v0

    :pswitch_4
    new-instance v0, Lt1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lt1;-><init>(Lu1;I)V

    return-object v0

    :pswitch_5
    new-instance v0, Lt1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lt1;-><init>(Lu1;C)V

    return-object v0

    :pswitch_6
    new-instance v0, Lt1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lt1;-><init>(Lu1;B)V

    return-object v0

    :pswitch_7
    new-instance v0, Lt1;

    invoke-direct {v0, p0}, Lt1;-><init>(Lu1;)V

    return-object v0

    :pswitch_8
    new-instance v0, Lt1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, v1}, Lt1;-><init>(Lu1;BB)V

    return-object v0

    :pswitch_9
    new-instance v0, Lt1;

    const-class v1, Lq1;

    invoke-direct {v0, v1}, Lt1;-><init>(Ljava/lang/Class;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e()LUm;
    .locals 1

    iget v0, p0, Lu1;->d:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, LUm;->c:LUm;

    return-object v0

    :pswitch_0
    sget-object v0, LUm;->f:LUm;

    return-object v0

    :pswitch_1
    sget-object v0, LUm;->f:LUm;

    return-object v0

    :pswitch_2
    sget-object v0, LUm;->c:LUm;

    return-object v0

    :pswitch_3
    sget-object v0, LUm;->c:LUm;

    return-object v0

    :pswitch_4
    sget-object v0, LUm;->c:LUm;

    return-object v0

    :pswitch_5
    sget-object v0, LUm;->c:LUm;

    return-object v0

    :pswitch_6
    sget-object v0, LUm;->c:LUm;

    return-object v0

    :pswitch_7
    sget-object v0, LUm;->c:LUm;

    return-object v0

    :pswitch_8
    sget-object v0, LUm;->c:LUm;

    return-object v0

    :pswitch_9
    sget-object v0, LUm;->c:LUm;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Ly6;)LB;
    .locals 1

    iget v0, p0, Lu1;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, LUF;->B(Ly6;LTg;)LUF;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, Lzn;->B(Ly6;LTg;)Lzn;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, Lun;->B(Ly6;LTg;)Lun;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, Le7;->B(Ly6;LTg;)Le7;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, Lo2;->B(Ly6;LTg;)Lo2;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, Lg2;->B(Ly6;LTg;)Lg2;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, LY1;->B(Ly6;LTg;)LY1;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, LO1;->D(Ly6;LTg;)LO1;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, LB1;->D(Ly6;LTg;)LB1;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, LCk;->E(Ly6;LTg;)LCk;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, Ln1;->D(Ly6;LTg;)Ln1;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(LB;)V
    .locals 8

    iget v0, p0, Lu1;->d:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, LUF;

    invoke-virtual {p1}, LUF;->z()I

    move-result v0

    invoke-static {v0}, LCD;->c(I)V

    invoke-virtual {p1}, LUF;->y()Ly6;

    move-result-object p1

    invoke-virtual {p1}, Ly6;->size()I

    move-result p1

    const/16 v0, 0x20

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid XChaCha20Poly1305Key: incorrect key length"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    check-cast p1, Lzn;

    invoke-virtual {p1}, Lzn;->z()I

    move-result p1

    invoke-static {p1}, LCD;->c(I)V

    return-void

    :pswitch_1
    check-cast p1, Lun;

    invoke-virtual {p1}, Lun;->z()I

    move-result p1

    invoke-static {p1}, LCD;->c(I)V

    return-void

    :pswitch_2
    check-cast p1, Le7;

    invoke-virtual {p1}, Le7;->z()I

    move-result v0

    invoke-static {v0}, LCD;->c(I)V

    invoke-virtual {p1}, Le7;->y()Ly6;

    move-result-object p1

    invoke-virtual {p1}, Ly6;->size()I

    move-result p1

    const/16 v0, 0x20

    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid ChaCha20Poly1305Key: incorrect key length"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    check-cast p1, Lo2;

    invoke-virtual {p1}, Lo2;->z()I

    move-result v0

    invoke-static {v0}, LCD;->c(I)V

    invoke-virtual {p1}, Lo2;->y()Ly6;

    move-result-object v0

    invoke-virtual {v0}, Ly6;->size()I

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_2

    return-void

    :cond_2
    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid key size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lo2;->y()Ly6;

    move-result-object p1

    invoke-virtual {p1}, Ly6;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Valid keys must have 64 bytes."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_4
    check-cast p1, Lg2;

    invoke-virtual {p1}, Lg2;->z()I

    move-result v0

    invoke-static {v0}, LCD;->c(I)V

    invoke-virtual {p1}, Lg2;->y()Ly6;

    move-result-object p1

    invoke-virtual {p1}, Ly6;->size()I

    move-result p1

    invoke-static {p1}, LCD;->a(I)V

    return-void

    :pswitch_5
    check-cast p1, LY1;

    invoke-virtual {p1}, LY1;->z()I

    move-result v0

    invoke-static {v0}, LCD;->c(I)V

    invoke-virtual {p1}, LY1;->y()Ly6;

    move-result-object p1

    invoke-virtual {p1}, Ly6;->size()I

    move-result p1

    invoke-static {p1}, LCD;->a(I)V

    return-void

    :pswitch_6
    check-cast p1, LO1;

    invoke-virtual {p1}, LO1;->B()I

    move-result v0

    invoke-static {v0}, LCD;->c(I)V

    invoke-virtual {p1}, LO1;->z()Ly6;

    move-result-object v0

    invoke-virtual {v0}, Ly6;->size()I

    move-result v0

    invoke-static {v0}, LCD;->a(I)V

    invoke-virtual {p1}, LO1;->A()LU1;

    move-result-object v0

    invoke-virtual {v0}, LU1;->y()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_4

    invoke-virtual {p1}, LO1;->A()LU1;

    move-result-object p1

    invoke-virtual {p1}, LU1;->y()I

    move-result p1

    const/16 v0, 0x10

    if-ne p1, v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_0
    return-void

    :pswitch_7
    check-cast p1, LB1;

    invoke-virtual {p1}, LB1;->B()I

    move-result v0

    invoke-static {v0}, LCD;->c(I)V

    new-instance v0, Ls1;

    const-class v1, Lhl;

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v0}, [Ls1;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    aget-object v3, v0, v2

    iget-object v4, v3, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    const-string v6, "KeyTypeManager constructed with duplicate factories for primitive "

    if-nez v5, :cond_8

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v0, v0, v2

    iget-object v0, v0, Ls1;->a:Ljava/lang/Class;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    invoke-virtual {p1}, LB1;->z()LH1;

    move-result-object v0

    invoke-virtual {v0}, LH1;->C()I

    move-result v1

    invoke-static {v1}, LCD;->c(I)V

    invoke-virtual {v0}, LH1;->A()Ly6;

    move-result-object v1

    invoke-virtual {v1}, Ly6;->size()I

    move-result v1

    invoke-static {v1}, LCD;->a(I)V

    invoke-virtual {v0}, LH1;->B()LL1;

    move-result-object v0

    invoke-virtual {v0}, LL1;->y()I

    move-result v1

    const/16 v3, 0xc

    if-lt v1, v3, :cond_7

    invoke-virtual {v0}, LL1;->y()I

    move-result v0

    const/16 v1, 0x10

    if-gt v0, v1, :cond_7

    new-instance v0, Ls1;

    const-class v3, LUp;

    const/16 v4, 0x8

    invoke-direct {v0, v4, v3}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v0}, [Ls1;

    move-result-object v0

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    aget-object v4, v0, v2

    iget-object v5, v4, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v0, v0, v2

    iget-object v0, v0, Ls1;->a:Ljava/lang/Class;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    invoke-virtual {p1}, LB1;->A()LCk;

    move-result-object p1

    invoke-virtual {p1}, LCk;->C()I

    move-result v0

    invoke-static {v0}, LCD;->c(I)V

    invoke-virtual {p1}, LCk;->A()Ly6;

    move-result-object v0

    invoke-virtual {v0}, Ly6;->size()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p1}, LCk;->B()LIk;

    move-result-object p1

    invoke-static {p1}, Lu1;->n(LIk;)V

    return-void

    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_8
    check-cast p1, LCk;

    invoke-virtual {p1}, LCk;->C()I

    move-result v0

    invoke-static {v0}, LCD;->c(I)V

    invoke-virtual {p1}, LCk;->A()Ly6;

    move-result-object v0

    invoke-virtual {v0}, Ly6;->size()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_9

    invoke-virtual {p1}, LCk;->B()LIk;

    move-result-object p1

    invoke-static {p1}, Lu1;->n(LIk;)V

    return-void

    :cond_9
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_9
    check-cast p1, Ln1;

    invoke-virtual {p1}, Ln1;->B()I

    move-result v0

    invoke-static {v0}, LCD;->c(I)V

    invoke-virtual {p1}, Ln1;->z()Ly6;

    move-result-object v0

    invoke-virtual {v0}, Ly6;->size()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_a

    invoke-virtual {p1}, Ln1;->A()Ly1;

    move-result-object p1

    invoke-static {p1}, Lu1;->m(Ly1;)V

    return-void

    :cond_a
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
