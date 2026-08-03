.class public final Lt1;
.super Lv5;
.source ""


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lt1;->b:I

    invoke-direct {p0, p1}, Lv5;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lu1;)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Lt1;->b:I

    const-class p1, LD1;

    .line 10
    invoke-direct {p0, p1}, Lv5;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lu1;B)V
    .locals 0

    const/4 p1, 0x2

    iput p1, p0, Lt1;->b:I

    const-class p1, LR1;

    .line 5
    invoke-direct {p0, p1}, Lv5;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lu1;BB)V
    .locals 0

    const/4 p1, 0x7

    iput p1, p0, Lt1;->b:I

    const-class p1, LFk;

    .line 11
    invoke-direct {p0, p1}, Lv5;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lu1;BC)V
    .locals 0

    const/16 p1, 0x8

    iput p1, p0, Lt1;->b:I

    const-class p1, Lvn;

    .line 2
    invoke-direct {p0, p1}, Lv5;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lu1;BI)V
    .locals 0

    const/16 p1, 0x9

    iput p1, p0, Lt1;->b:I

    const-class p1, LAn;

    .line 3
    invoke-direct {p0, p1}, Lv5;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lu1;BS)V
    .locals 0

    const/16 p1, 0xa

    iput p1, p0, Lt1;->b:I

    const-class p1, LWF;

    .line 8
    invoke-direct {p0, p1}, Lv5;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lu1;BZ)V
    .locals 0

    const/4 p1, 0x6

    iput p1, p0, Lt1;->b:I

    const-class p1, Lh7;

    .line 6
    invoke-direct {p0, p1}, Lv5;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lu1;C)V
    .locals 0

    const/4 p1, 0x3

    iput p1, p0, Lt1;->b:I

    const-class p1, Lb2;

    .line 4
    invoke-direct {p0, p1}, Lv5;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lu1;I)V
    .locals 0

    const/4 p1, 0x4

    iput p1, p0, Lt1;->b:I

    const-class p1, Lj2;

    .line 7
    invoke-direct {p0, p1}, Lv5;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lu1;S)V
    .locals 0

    const/4 p1, 0x5

    iput p1, p0, Lt1;->b:I

    const-class p1, Lq2;

    .line 9
    invoke-direct {p0, p1}, Lv5;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(LB;)LB;
    .locals 10

    iget v0, p0, Lt1;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, LWF;

    invoke-static {}, LUF;->A()LTF;

    move-result-object p1

    invoke-virtual {p1}, Ltj;->e()V

    iget-object v0, p1, Ltj;->b:Lvj;

    check-cast v0, LUF;

    invoke-static {v0}, LUF;->w(LUF;)V

    const/16 v0, 0x20

    invoke-static {v0}, Lav;->a(I)[B

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ly6;->c([BII)Lx6;

    move-result-object v0

    invoke-virtual {p1}, Ltj;->e()V

    iget-object v1, p1, Ltj;->b:Lvj;

    check-cast v1, LUF;

    invoke-static {v1, v0}, LUF;->x(LUF;Lx6;)V

    invoke-virtual {p1}, Ltj;->b()Lvj;

    move-result-object p1

    check-cast p1, LUF;

    return-object p1

    :pswitch_0
    check-cast p1, LAn;

    invoke-static {}, Lzn;->A()Lyn;

    move-result-object v0

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v1, v0, Ltj;->b:Lvj;

    check-cast v1, Lzn;

    invoke-static {v1, p1}, Lzn;->x(Lzn;LAn;)V

    invoke-virtual {v0}, Ltj;->e()V

    iget-object p1, v0, Ltj;->b:Lvj;

    check-cast p1, Lzn;

    invoke-static {p1}, Lzn;->w(Lzn;)V

    invoke-virtual {v0}, Ltj;->b()Lvj;

    move-result-object p1

    check-cast p1, Lzn;

    return-object p1

    :pswitch_1
    check-cast p1, Lvn;

    invoke-static {}, Lun;->A()Ltn;

    move-result-object v0

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v1, v0, Ltj;->b:Lvj;

    check-cast v1, Lun;

    invoke-static {v1, p1}, Lun;->x(Lun;Lvn;)V

    invoke-virtual {v0}, Ltj;->e()V

    iget-object p1, v0, Ltj;->b:Lvj;

    check-cast p1, Lun;

    invoke-static {p1}, Lun;->w(Lun;)V

    invoke-virtual {v0}, Ltj;->b()Lvj;

    move-result-object p1

    check-cast p1, Lun;

    return-object p1

    :pswitch_2
    check-cast p1, LFk;

    invoke-static {}, LCk;->D()LBk;

    move-result-object v0

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v1, v0, Ltj;->b:Lvj;

    check-cast v1, LCk;

    invoke-static {v1}, LCk;->w(LCk;)V

    invoke-virtual {p1}, LFk;->A()LIk;

    move-result-object v1

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v2, v0, Ltj;->b:Lvj;

    check-cast v2, LCk;

    invoke-static {v2, v1}, LCk;->x(LCk;LIk;)V

    invoke-virtual {p1}, LFk;->z()I

    move-result p1

    invoke-static {p1}, Lav;->a(I)[B

    move-result-object p1

    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v1}, Ly6;->c([BII)Lx6;

    move-result-object p1

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v1, v0, Ltj;->b:Lvj;

    check-cast v1, LCk;

    invoke-static {v1, p1}, LCk;->y(LCk;Lx6;)V

    invoke-virtual {v0}, Ltj;->b()Lvj;

    move-result-object p1

    check-cast p1, LCk;

    return-object p1

    :pswitch_3
    check-cast p1, Lh7;

    invoke-static {}, Le7;->A()Ld7;

    move-result-object p1

    invoke-virtual {p1}, Ltj;->e()V

    iget-object v0, p1, Ltj;->b:Lvj;

    check-cast v0, Le7;

    invoke-static {v0}, Le7;->w(Le7;)V

    const/16 v0, 0x20

    invoke-static {v0}, Lav;->a(I)[B

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ly6;->c([BII)Lx6;

    move-result-object v0

    invoke-virtual {p1}, Ltj;->e()V

    iget-object v1, p1, Ltj;->b:Lvj;

    check-cast v1, Le7;

    invoke-static {v1, v0}, Le7;->x(Le7;Lx6;)V

    invoke-virtual {p1}, Ltj;->b()Lvj;

    move-result-object p1

    check-cast p1, Le7;

    return-object p1

    :pswitch_4
    check-cast p1, Lq2;

    invoke-static {}, Lo2;->A()Ln2;

    move-result-object v0

    invoke-virtual {p1}, Lq2;->x()I

    move-result p1

    invoke-static {p1}, Lav;->a(I)[B

    move-result-object p1

    const/4 v1, 0x0

    array-length v2, p1

    invoke-static {p1, v1, v2}, Ly6;->c([BII)Lx6;

    move-result-object p1

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v1, v0, Ltj;->b:Lvj;

    check-cast v1, Lo2;

    invoke-static {v1, p1}, Lo2;->x(Lo2;Lx6;)V

    invoke-virtual {v0}, Ltj;->e()V

    iget-object p1, v0, Ltj;->b:Lvj;

    check-cast p1, Lo2;

    invoke-static {p1}, Lo2;->w(Lo2;)V

    invoke-virtual {v0}, Ltj;->b()Lvj;

    move-result-object p1

    check-cast p1, Lo2;

    return-object p1

    :pswitch_5
    check-cast p1, Lj2;

    invoke-static {}, Lg2;->A()Lf2;

    move-result-object v0

    invoke-virtual {p1}, Lj2;->x()I

    move-result p1

    invoke-static {p1}, Lav;->a(I)[B

    move-result-object p1

    const/4 v1, 0x0

    array-length v2, p1

    invoke-static {p1, v1, v2}, Ly6;->c([BII)Lx6;

    move-result-object p1

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v1, v0, Ltj;->b:Lvj;

    check-cast v1, Lg2;

    invoke-static {v1, p1}, Lg2;->x(Lg2;Lx6;)V

    invoke-virtual {v0}, Ltj;->e()V

    iget-object p1, v0, Ltj;->b:Lvj;

    check-cast p1, Lg2;

    invoke-static {p1}, Lg2;->w(Lg2;)V

    invoke-virtual {v0}, Ltj;->b()Lvj;

    move-result-object p1

    check-cast p1, Lg2;

    return-object p1

    :pswitch_6
    check-cast p1, Lb2;

    invoke-static {}, LY1;->A()LX1;

    move-result-object v0

    invoke-virtual {p1}, Lb2;->x()I

    move-result p1

    invoke-static {p1}, Lav;->a(I)[B

    move-result-object p1

    const/4 v1, 0x0

    array-length v2, p1

    invoke-static {p1, v1, v2}, Ly6;->c([BII)Lx6;

    move-result-object p1

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v1, v0, Ltj;->b:Lvj;

    check-cast v1, LY1;

    invoke-static {v1, p1}, LY1;->x(LY1;Lx6;)V

    invoke-virtual {v0}, Ltj;->e()V

    iget-object p1, v0, Ltj;->b:Lvj;

    check-cast p1, LY1;

    invoke-static {p1}, LY1;->w(LY1;)V

    invoke-virtual {v0}, Ltj;->b()Lvj;

    move-result-object p1

    check-cast p1, LY1;

    return-object p1

    :pswitch_7
    check-cast p1, LR1;

    invoke-static {}, LO1;->C()LN1;

    move-result-object v0

    invoke-virtual {p1}, LR1;->y()I

    move-result v1

    invoke-static {v1}, Lav;->a(I)[B

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    invoke-static {v1, v2, v3}, Ly6;->c([BII)Lx6;

    move-result-object v1

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v2, v0, Ltj;->b:Lvj;

    check-cast v2, LO1;

    invoke-static {v2, v1}, LO1;->y(LO1;Lx6;)V

    invoke-virtual {p1}, LR1;->z()LU1;

    move-result-object p1

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v1, v0, Ltj;->b:Lvj;

    check-cast v1, LO1;

    invoke-static {v1, p1}, LO1;->x(LO1;LU1;)V

    invoke-virtual {v0}, Ltj;->e()V

    iget-object p1, v0, Ltj;->b:Lvj;

    check-cast p1, LO1;

    invoke-static {p1}, LO1;->w(LO1;)V

    invoke-virtual {v0}, Ltj;->b()Lvj;

    move-result-object p1

    check-cast p1, LO1;

    return-object p1

    :pswitch_8
    check-cast p1, LD1;

    new-instance v0, Ls1;

    const-class v1, Lhl;

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v0}, [Ls1;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const-string v5, "KeyTypeManager constructed with duplicate factories for primitive "

    if-ge v4, v2, :cond_1

    aget-object v6, v0, v4

    iget-object v7, v6, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    invoke-virtual {v1, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    array-length v2, v0

    if-lez v2, :cond_2

    aget-object v0, v0, v3

    iget-object v0, v0, Ls1;->a:Ljava/lang/Class;

    :cond_2
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    invoke-virtual {p1}, LD1;->y()LJ1;

    move-result-object v0

    invoke-static {}, LH1;->D()LG1;

    move-result-object v1

    invoke-virtual {v0}, LJ1;->A()LL1;

    move-result-object v2

    invoke-virtual {v1}, Ltj;->e()V

    iget-object v4, v1, Ltj;->b:Lvj;

    check-cast v4, LH1;

    invoke-static {v4, v2}, LH1;->x(LH1;LL1;)V

    invoke-virtual {v0}, LJ1;->z()I

    move-result v0

    invoke-static {v0}, Lav;->a(I)[B

    move-result-object v0

    array-length v2, v0

    invoke-static {v0, v3, v2}, Ly6;->c([BII)Lx6;

    move-result-object v0

    invoke-virtual {v1}, Ltj;->e()V

    iget-object v2, v1, Ltj;->b:Lvj;

    check-cast v2, LH1;

    invoke-static {v2, v0}, LH1;->y(LH1;Lx6;)V

    invoke-virtual {v1}, Ltj;->e()V

    iget-object v0, v1, Ltj;->b:Lvj;

    check-cast v0, LH1;

    invoke-static {v0}, LH1;->w(LH1;)V

    invoke-virtual {v1}, Ltj;->b()Lvj;

    move-result-object v0

    check-cast v0, LH1;

    new-instance v1, Ls1;

    const-class v2, LUp;

    const/16 v4, 0x8

    invoke-direct {v1, v4, v2}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v1}, [Ls1;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    array-length v4, v1

    move v6, v3

    :goto_1
    if-ge v6, v4, :cond_4

    aget-object v7, v1, v6

    iget-object v8, v7, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v2, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    invoke-virtual {v2, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    array-length v4, v1

    if-lez v4, :cond_5

    aget-object v1, v1, v3

    iget-object v1, v1, Ls1;->a:Ljava/lang/Class;

    :cond_5
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    invoke-virtual {p1}, LD1;->z()LFk;

    move-result-object p1

    invoke-static {}, LCk;->D()LBk;

    move-result-object v1

    invoke-virtual {v1}, Ltj;->e()V

    iget-object v2, v1, Ltj;->b:Lvj;

    check-cast v2, LCk;

    invoke-static {v2}, LCk;->w(LCk;)V

    invoke-virtual {p1}, LFk;->A()LIk;

    move-result-object v2

    invoke-virtual {v1}, Ltj;->e()V

    iget-object v4, v1, Ltj;->b:Lvj;

    check-cast v4, LCk;

    invoke-static {v4, v2}, LCk;->x(LCk;LIk;)V

    invoke-virtual {p1}, LFk;->z()I

    move-result p1

    invoke-static {p1}, Lav;->a(I)[B

    move-result-object p1

    array-length v2, p1

    invoke-static {p1, v3, v2}, Ly6;->c([BII)Lx6;

    move-result-object p1

    invoke-virtual {v1}, Ltj;->e()V

    iget-object v2, v1, Ltj;->b:Lvj;

    check-cast v2, LCk;

    invoke-static {v2, p1}, LCk;->y(LCk;Lx6;)V

    invoke-virtual {v1}, Ltj;->b()Lvj;

    move-result-object p1

    check-cast p1, LCk;

    invoke-static {}, LB1;->C()LA1;

    move-result-object v1

    invoke-virtual {v1}, Ltj;->e()V

    iget-object v2, v1, Ltj;->b:Lvj;

    check-cast v2, LB1;

    invoke-static {v2, v0}, LB1;->x(LB1;LH1;)V

    invoke-virtual {v1}, Ltj;->e()V

    iget-object v0, v1, Ltj;->b:Lvj;

    check-cast v0, LB1;

    invoke-static {v0, p1}, LB1;->y(LB1;LCk;)V

    invoke-virtual {v1}, Ltj;->e()V

    iget-object p1, v1, Ltj;->b:Lvj;

    check-cast p1, LB1;

    invoke-static {p1}, LB1;->w(LB1;)V

    invoke-virtual {v1}, Ltj;->b()Lvj;

    move-result-object p1

    check-cast p1, LB1;

    return-object p1

    :pswitch_9
    check-cast p1, Lq1;

    invoke-static {}, Ln1;->C()Lm1;

    move-result-object v0

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v1, v0, Ltj;->b:Lvj;

    check-cast v1, Ln1;

    invoke-static {v1}, Ln1;->w(Ln1;)V

    invoke-virtual {p1}, Lq1;->y()I

    move-result v1

    invoke-static {v1}, Lav;->a(I)[B

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Ly6;->c([BII)Lx6;

    move-result-object v1

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v2, v0, Ltj;->b:Lvj;

    check-cast v2, Ln1;

    invoke-static {v2, v1}, Ln1;->x(Ln1;Lx6;)V

    invoke-virtual {p1}, Lq1;->z()Ly1;

    move-result-object p1

    invoke-virtual {v0}, Ltj;->e()V

    iget-object v1, v0, Ltj;->b:Lvj;

    check-cast v1, Ln1;

    invoke-static {v1, p1}, Ln1;->y(Ln1;Ly1;)V

    invoke-virtual {v0}, Ltj;->b()Lvj;

    move-result-object p1

    check-cast p1, Ln1;

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

.method public c()Ljava/util/Map;
    .locals 9

    iget v0, p0, Lt1;->b:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-super {p0}, Lv5;->c()Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lhn;

    invoke-static {}, LWF;->w()LWF;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lhn;-><init>(Lvj;I)V

    const-string v2, "XCHACHA20_POLY1305"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lhn;

    invoke-static {}, LWF;->w()LWF;

    move-result-object v2

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lhn;-><init>(Lvj;I)V

    const-string v2, "XCHACHA20_POLY1305_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v1, 0x20

    const/16 v2, 0x10

    sget-object v3, Lrk;->e:Lrk;

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lu1;->l(IILrk;I)Lhn;

    move-result-object v5

    const-string v6, "HMAC_SHA256_128BITTAG"

    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x3

    invoke-static {v1, v2, v3, v5}, Lu1;->l(IILrk;I)Lhn;

    move-result-object v6

    const-string v7, "HMAC_SHA256_128BITTAG_RAW"

    invoke-virtual {v0, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "HMAC_SHA256_256BITTAG"

    invoke-static {v1, v1, v3, v4}, Lu1;->l(IILrk;I)Lhn;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "HMAC_SHA256_256BITTAG_RAW"

    invoke-static {v1, v1, v3, v5}, Lu1;->l(IILrk;I)Lhn;

    move-result-object v3

    invoke-virtual {v0, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v3, 0x40

    sget-object v6, Lrk;->f:Lrk;

    invoke-static {v3, v2, v6, v4}, Lu1;->l(IILrk;I)Lhn;

    move-result-object v7

    const-string v8, "HMAC_SHA512_128BITTAG"

    invoke-virtual {v0, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "HMAC_SHA512_128BITTAG_RAW"

    invoke-static {v3, v2, v6, v5}, Lu1;->l(IILrk;I)Lhn;

    move-result-object v2

    invoke-virtual {v0, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "HMAC_SHA512_256BITTAG"

    invoke-static {v3, v1, v6, v4}, Lu1;->l(IILrk;I)Lhn;

    move-result-object v7

    invoke-virtual {v0, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "HMAC_SHA512_256BITTAG_RAW"

    invoke-static {v3, v1, v6, v5}, Lu1;->l(IILrk;I)Lhn;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "HMAC_SHA512_512BITTAG"

    invoke-static {v3, v3, v6, v4}, Lu1;->l(IILrk;I)Lhn;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "HMAC_SHA512_512BITTAG_RAW"

    invoke-static {v3, v3, v6, v5}, Lu1;->l(IILrk;I)Lhn;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lhn;

    invoke-static {}, Lh7;->w()Lh7;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lhn;-><init>(Lvj;I)V

    const-string v2, "CHACHA20_POLY1305"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lhn;

    invoke-static {}, Lh7;->w()Lh7;

    move-result-object v2

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lhn;-><init>(Lvj;I)V

    const-string v2, "CHACHA20_POLY1305_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lhn;

    invoke-static {}, Lq2;->y()Lp2;

    move-result-object v2

    invoke-virtual {v2}, Ltj;->e()V

    iget-object v3, v2, Ltj;->b:Lvj;

    check-cast v3, Lq2;

    invoke-static {v3}, Lq2;->w(Lq2;)V

    invoke-virtual {v2}, Ltj;->b()Lvj;

    move-result-object v2

    check-cast v2, Lq2;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lhn;-><init>(Lvj;I)V

    const-string v2, "AES256_SIV"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lhn;

    invoke-static {}, Lq2;->y()Lp2;

    move-result-object v2

    invoke-virtual {v2}, Ltj;->e()V

    iget-object v3, v2, Ltj;->b:Lvj;

    check-cast v3, Lq2;

    invoke-static {v3}, Lq2;->w(Lq2;)V

    invoke-virtual {v2}, Ltj;->b()Lvj;

    move-result-object v2

    check-cast v2, Lq2;

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lhn;-><init>(Lvj;I)V

    const-string v2, "AES256_SIV_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v1, 0x10

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lu1;->k(II)Lhn;

    move-result-object v3

    const-string v4, "AES128_GCM_SIV"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v1, v3}, Lu1;->k(II)Lhn;

    move-result-object v1

    const-string v4, "AES128_GCM_SIV_RAW"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x20

    invoke-static {v1, v2}, Lu1;->k(II)Lhn;

    move-result-object v2

    const-string v4, "AES256_GCM_SIV"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "AES256_GCM_SIV_RAW"

    invoke-static {v1, v3}, Lu1;->k(II)Lhn;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_6
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v1, 0x10

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lu1;->j(II)Lhn;

    move-result-object v3

    const-string v4, "AES128_GCM"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v1, v3}, Lu1;->j(II)Lhn;

    move-result-object v1

    const-string v4, "AES128_GCM_RAW"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x20

    invoke-static {v1, v2}, Lu1;->j(II)Lhn;

    move-result-object v2

    const-string v4, "AES256_GCM"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "AES256_GCM_RAW"

    invoke-static {v1, v3}, Lu1;->j(II)Lhn;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v1, 0x10

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lu1;->h(II)Lhn;

    move-result-object v3

    const-string v4, "AES128_EAX"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v1, v3}, Lu1;->h(II)Lhn;

    move-result-object v1

    const-string v4, "AES128_EAX_RAW"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x20

    invoke-static {v1, v2}, Lu1;->h(II)Lhn;

    move-result-object v2

    const-string v4, "AES256_EAX"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "AES256_EAX_RAW"

    invoke-static {v1, v3}, Lu1;->h(II)Lhn;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_8
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v1, 0x10

    const/4 v2, 0x1

    invoke-static {v1, v1, v2}, Lu1;->i(III)Lhn;

    move-result-object v3

    const-string v4, "AES128_CTR_HMAC_SHA256"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v1, v1, v3}, Lu1;->i(III)Lhn;

    move-result-object v1

    const-string v4, "AES128_CTR_HMAC_SHA256_RAW"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x20

    invoke-static {v1, v1, v2}, Lu1;->i(III)Lhn;

    move-result-object v2

    const-string v4, "AES256_CTR_HMAC_SHA256"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "AES256_CTR_HMAC_SHA256_RAW"

    invoke-static {v1, v1, v3}, Lu1;->i(III)Lhn;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_9
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lhn;

    invoke-static {}, Lq1;->A()Lp1;

    move-result-object v2

    invoke-virtual {v2}, Ltj;->e()V

    iget-object v3, v2, Ltj;->b:Lvj;

    check-cast v3, Lq1;

    invoke-static {v3}, Lq1;->w(Lq1;)V

    invoke-static {}, Ly1;->z()Lx1;

    move-result-object v3

    invoke-virtual {v3}, Ltj;->e()V

    iget-object v4, v3, Ltj;->b:Lvj;

    check-cast v4, Ly1;

    invoke-static {v4}, Ly1;->w(Ly1;)V

    invoke-virtual {v3}, Ltj;->b()Lvj;

    move-result-object v3

    check-cast v3, Ly1;

    invoke-virtual {v2}, Ltj;->e()V

    iget-object v4, v2, Ltj;->b:Lvj;

    check-cast v4, Lq1;

    invoke-static {v4, v3}, Lq1;->x(Lq1;Ly1;)V

    invoke-virtual {v2}, Ltj;->b()Lvj;

    move-result-object v2

    check-cast v2, Lq1;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lhn;-><init>(Lvj;I)V

    const-string v2, "AES_CMAC"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lhn;

    invoke-static {}, Lq1;->A()Lp1;

    move-result-object v2

    invoke-virtual {v2}, Ltj;->e()V

    iget-object v4, v2, Ltj;->b:Lvj;

    check-cast v4, Lq1;

    invoke-static {v4}, Lq1;->w(Lq1;)V

    invoke-static {}, Ly1;->z()Lx1;

    move-result-object v4

    invoke-virtual {v4}, Ltj;->e()V

    iget-object v5, v4, Ltj;->b:Lvj;

    check-cast v5, Ly1;

    invoke-static {v5}, Ly1;->w(Ly1;)V

    invoke-virtual {v4}, Ltj;->b()Lvj;

    move-result-object v4

    check-cast v4, Ly1;

    invoke-virtual {v2}, Ltj;->e()V

    iget-object v5, v2, Ltj;->b:Lvj;

    check-cast v5, Lq1;

    invoke-static {v5, v4}, Lq1;->x(Lq1;Ly1;)V

    invoke-virtual {v2}, Ltj;->b()Lvj;

    move-result-object v2

    check-cast v2, Lq1;

    invoke-direct {v1, v2, v3}, Lhn;-><init>(Lvj;I)V

    const-string v2, "AES256_CMAC"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lhn;

    invoke-static {}, Lq1;->A()Lp1;

    move-result-object v2

    invoke-virtual {v2}, Ltj;->e()V

    iget-object v3, v2, Ltj;->b:Lvj;

    check-cast v3, Lq1;

    invoke-static {v3}, Lq1;->w(Lq1;)V

    invoke-static {}, Ly1;->z()Lx1;

    move-result-object v3

    invoke-virtual {v3}, Ltj;->e()V

    iget-object v4, v3, Ltj;->b:Lvj;

    check-cast v4, Ly1;

    invoke-static {v4}, Ly1;->w(Ly1;)V

    invoke-virtual {v3}, Ltj;->b()Lvj;

    move-result-object v3

    check-cast v3, Ly1;

    invoke-virtual {v2}, Ltj;->e()V

    iget-object v4, v2, Ltj;->b:Lvj;

    check-cast v4, Lq1;

    invoke-static {v4, v3}, Lq1;->x(Lq1;Ly1;)V

    invoke-virtual {v2}, Ltj;->b()Lvj;

    move-result-object v2

    check-cast v2, Lq1;

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lhn;-><init>(Lvj;I)V

    const-string v2, "AES256_CMAC_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

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
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final e(Ly6;)LB;
    .locals 1

    iget v0, p0, Lt1;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, LWF;->x(Ly6;LTg;)LWF;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, LAn;->A(Ly6;LTg;)LAn;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, Lvn;->y(Ly6;LTg;)Lvn;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, LFk;->C(Ly6;LTg;)LFk;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, Lh7;->x(Ly6;LTg;)Lh7;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, Lq2;->z(Ly6;LTg;)Lq2;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, Lj2;->z(Ly6;LTg;)Lj2;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, Lb2;->z(Ly6;LTg;)Lb2;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, LR1;->B(Ly6;LTg;)LR1;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, LD1;->B(Ly6;LTg;)LD1;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {}, LTg;->a()LTg;

    move-result-object v0

    invoke-static {p1, v0}, Lq1;->B(Ly6;LTg;)Lq1;

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

.method public final f(LB;)V
    .locals 10

    iget v0, p0, Lt1;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, LWF;

    return-void

    :pswitch_0
    check-cast p1, LAn;

    invoke-virtual {p1}, LAn;->y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LAn;->z()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid key format: missing KEK URI or DEK template"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    check-cast p1, Lvn;

    return-void

    :pswitch_2
    check-cast p1, LFk;

    invoke-virtual {p1}, LFk;->z()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    invoke-virtual {p1}, LFk;->A()LIk;

    move-result-object p1

    invoke-static {p1}, Lu1;->n(LIk;)V

    return-void

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    check-cast p1, Lh7;

    return-void

    :pswitch_4
    check-cast p1, Lq2;

    invoke-virtual {p1}, Lq2;->x()I

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_2

    return-void

    :cond_2
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid key size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lq2;->x()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Valid keys must have 64 bytes."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_5
    check-cast p1, Lj2;

    invoke-virtual {p1}, Lj2;->x()I

    move-result p1

    invoke-static {p1}, LCD;->a(I)V

    return-void

    :pswitch_6
    check-cast p1, Lb2;

    invoke-virtual {p1}, Lb2;->x()I

    move-result p1

    invoke-static {p1}, LCD;->a(I)V

    return-void

    :pswitch_7
    check-cast p1, LR1;

    invoke-virtual {p1}, LR1;->y()I

    move-result v0

    invoke-static {v0}, LCD;->a(I)V

    invoke-virtual {p1}, LR1;->z()LU1;

    move-result-object v0

    invoke-virtual {v0}, LU1;->y()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_4

    invoke-virtual {p1}, LR1;->z()LU1;

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

    :pswitch_8
    check-cast p1, LD1;

    new-instance v0, Ls1;

    const-class v1, Lhl;

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v0}, [Ls1;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    const-string v5, "KeyTypeManager constructed with duplicate factories for primitive "

    if-ge v4, v2, :cond_6

    aget-object v6, v0, v4

    iget-object v7, v6, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v1, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    array-length v2, v0

    if-lez v2, :cond_7

    aget-object v0, v0, v3

    iget-object v0, v0, Ls1;->a:Ljava/lang/Class;

    :cond_7
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    invoke-virtual {p1}, LD1;->y()LJ1;

    move-result-object v0

    invoke-virtual {v0}, LJ1;->z()I

    move-result v1

    invoke-static {v1}, LCD;->a(I)V

    invoke-virtual {v0}, LJ1;->A()LL1;

    move-result-object v0

    invoke-virtual {v0}, LL1;->y()I

    move-result v1

    const/16 v2, 0xc

    if-lt v1, v2, :cond_c

    invoke-virtual {v0}, LL1;->y()I

    move-result v0

    const/16 v1, 0x10

    if-gt v0, v1, :cond_c

    new-instance v0, Ls1;

    const-class v2, LUp;

    const/16 v4, 0x8

    invoke-direct {v0, v4, v2}, Ls1;-><init>(ILjava/lang/Class;)V

    filled-new-array {v0}, [Ls1;

    move-result-object v0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    array-length v4, v0

    move v6, v3

    :goto_2
    if-ge v6, v4, :cond_9

    aget-object v7, v0, v6

    iget-object v8, v7, Ls1;->a:Ljava/lang/Class;

    invoke-virtual {v2, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    invoke-virtual {v2, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    array-length v4, v0

    if-lez v4, :cond_a

    aget-object v0, v0, v3

    iget-object v0, v0, Ls1;->a:Ljava/lang/Class;

    :cond_a
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    invoke-virtual {p1}, LD1;->z()LFk;

    move-result-object v0

    invoke-virtual {v0}, LFk;->z()I

    move-result v2

    if-lt v2, v1, :cond_b

    invoke-virtual {v0}, LFk;->A()LIk;

    move-result-object v0

    invoke-static {v0}, Lu1;->n(LIk;)V

    invoke-virtual {p1}, LD1;->y()LJ1;

    move-result-object p1

    invoke-virtual {p1}, LJ1;->z()I

    move-result p1

    invoke-static {p1}, LCD;->a(I)V

    return-void

    :cond_b
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_9
    check-cast p1, Lq1;

    invoke-virtual {p1}, Lq1;->z()Ly1;

    move-result-object v0

    invoke-static {v0}, Lu1;->m(Ly1;)V

    invoke-virtual {p1}, Lq1;->y()I

    move-result p1

    const/16 v0, 0x20

    if-ne p1, v0, :cond_d

    return-void

    :cond_d
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
