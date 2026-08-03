.class public LYue/ۥ۠ۤ۟ۧ;
.super LYue/ۥ۟ۧ۟ۢ;
.source "SourceFile"


# static fields
.field public static final ۥ۟۠۠:I = 0x0

.field public static final ۥ۟۠۠۟:I = 0x1

.field public static final ۥ۟۠۠۠:I = 0x0

.field public static final ۥ۟۠۠ۡ:I = 0x1

.field public static final ۥ۟۠۠ۢ:I = 0x2

.field public static final ۥۣ۟۠۠:I = -0x1


# instance fields
.field public ۥ۟۠۟ۢ:F

.field public ۥۣ۟۠۟:I

.field public ۥ۟۠۟ۤ:I

.field public ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

.field public ۥ۟۠۟ۦ:I

.field public ۥ۟۠۟ۧ:I

.field public ۥ۟۠۟ۨ:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, LYue/ۥ۟ۧ۟ۢ;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۢ:F

    const/4 v0, -0x1

    iput v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠۟:I

    iput v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۤ:I

    iget-object v0, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢ:LYue/ۥ۟ۧ۟۠;

    iput-object v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۦ:I

    iput v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۧ:I

    iget-object v1, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۦ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۦ:Ljava/util/ArrayList;

    iget-object v2, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۥ:[LYue/ۥ۟ۧ۟۠;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۥ:[LYue/ۥ۟ۧ۟۠;

    iget-object v3, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۡ(LYue/ۥ۠ۧۡۤ;Z)V
    .locals 7

    invoke-virtual {p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۨ()LYue/ۥ۟ۧ۟ۢ;

    move-result-object p2

    check-cast p2, LYue/ۥۣ۟ۧ۟;

    if-nez p2, :cond_0

    return-void

    :cond_0
    sget-object v0, LYue/ۥ۟ۧ۟۠$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧ۟۠$ۥ۟;

    invoke-virtual {p2, v0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۡ(LYue/ۥ۟ۧ۟۠$ۥ۟;)LYue/ۥ۟ۧ۟۠;

    move-result-object v0

    sget-object v1, LYue/ۥ۟ۧ۟۠$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧ۟۠$ۥ۟;

    invoke-virtual {p2, v1}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۡ(LYue/ۥ۟ۧ۟۠$ۥ۟;)LYue/ۥ۟ۧ۟۠;

    move-result-object v1

    iget-object v2, p0, LYue/ۥ۟ۧ۟ۢ;->ۥۣ۟۟:LYue/ۥ۟ۧ۟ۢ;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    iget-object v2, v2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۨ:[LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    aget-object v2, v2, v4

    sget-object v5, LYue/ۥ۟ۧ۟ۢ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    if-ne v2, v5, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_0
    iget v5, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۦ:I

    if-nez v5, :cond_3

    sget-object v0, LYue/ۥ۟ۧ۟۠$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧ۟۠$ۥ۟;

    invoke-virtual {p2, v0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۡ(LYue/ۥ۟ۧ۟۠$ۥ۟;)LYue/ۥ۟ۧ۟۠;

    move-result-object v0

    sget-object v1, LYue/ۥ۟ۧ۟۠$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۟ۧ۟۠$ۥ۟;

    invoke-virtual {p2, v1}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۡ(LYue/ۥ۟ۧ۟۠$ۥ۟;)LYue/ۥ۟ۧ۟۠;

    move-result-object v1

    iget-object p2, p0, LYue/ۥ۟ۧ۟ۢ;->ۥۣ۟۟:LYue/ۥ۟ۧ۟ۢ;

    if-eqz p2, :cond_2

    iget-object p2, p2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۨ:[LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    aget-object p2, p2, v3

    sget-object v2, LYue/ۥ۟ۧ۟ۢ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    if-ne p2, v2, :cond_2

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    move v2, v3

    :cond_3
    iget-boolean p2, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۨ:Z

    const/4 v3, -0x1

    const/4 v5, 0x5

    if-eqz p2, :cond_6

    iget-object p2, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {p2}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۠()Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p2, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {p1, p2}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۠ۤ(Ljava/lang/Object;)LYue/ۥۣۣۢ۟;

    move-result-object p2

    iget-object v6, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {v6}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۠()I

    move-result v6

    invoke-virtual {p1, p2, v6}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۟۠(LYue/ۥۣۣۢ۟;I)V

    iget v6, p0, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠۟:I

    if-eq v6, v3, :cond_4

    if-eqz v2, :cond_5

    invoke-virtual {p1, v1}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۠ۤ(Ljava/lang/Object;)LYue/ۥۣۣۢ۟;

    move-result-object v0

    invoke-virtual {p1, v0, p2, v4, v5}, LYue/ۥ۠ۧۡۤ;->ۥۣ۟۟۟(LYue/ۥۣۣۢ۟;LYue/ۥۣۣۢ۟;II)V

    goto :goto_2

    :cond_4
    iget v6, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۤ:I

    if-eq v6, v3, :cond_5

    if-eqz v2, :cond_5

    invoke-virtual {p1, v1}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۠ۤ(Ljava/lang/Object;)LYue/ۥۣۣۢ۟;

    move-result-object v1

    invoke-virtual {p1, v0}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۠ۤ(Ljava/lang/Object;)LYue/ۥۣۣۢ۟;

    move-result-object v0

    invoke-virtual {p1, p2, v0, v4, v5}, LYue/ۥ۠ۧۡۤ;->ۥۣ۟۟۟(LYue/ۥۣۣۢ۟;LYue/ۥۣۣۢ۟;II)V

    invoke-virtual {p1, v1, p2, v4, v5}, LYue/ۥ۠ۧۡۤ;->ۥۣ۟۟۟(LYue/ۥۣۣۢ۟;LYue/ۥۣۣۢ۟;II)V

    :cond_5
    :goto_2
    iput-boolean v4, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۨ:Z

    return-void

    :cond_6
    iget p2, p0, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠۟:I

    const/16 v6, 0x8

    if-eq p2, v3, :cond_7

    iget-object p2, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {p1, p2}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۠ۤ(Ljava/lang/Object;)LYue/ۥۣۣۢ۟;

    move-result-object p2

    invoke-virtual {p1, v0}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۠ۤ(Ljava/lang/Object;)LYue/ۥۣۣۢ۟;

    move-result-object v0

    iget v3, p0, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠۟:I

    invoke-virtual {p1, p2, v0, v3, v6}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۟۟(LYue/ۥۣۣۢ۟;LYue/ۥۣۣۢ۟;II)LYue/ۥ۟ۡۨۥ;

    if-eqz v2, :cond_9

    invoke-virtual {p1, v1}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۠ۤ(Ljava/lang/Object;)LYue/ۥۣۣۢ۟;

    move-result-object v0

    invoke-virtual {p1, v0, p2, v4, v5}, LYue/ۥ۠ۧۡۤ;->ۥۣ۟۟۟(LYue/ۥۣۣۢ۟;LYue/ۥۣۣۢ۟;II)V

    goto :goto_3

    :cond_7
    iget p2, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۤ:I

    if-eq p2, v3, :cond_8

    iget-object p2, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {p1, p2}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۠ۤ(Ljava/lang/Object;)LYue/ۥۣۣۢ۟;

    move-result-object p2

    invoke-virtual {p1, v1}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۠ۤ(Ljava/lang/Object;)LYue/ۥۣۣۢ۟;

    move-result-object v1

    iget v3, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۤ:I

    neg-int v3, v3

    invoke-virtual {p1, p2, v1, v3, v6}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۟۟(LYue/ۥۣۣۢ۟;LYue/ۥۣۣۢ۟;II)LYue/ۥ۟ۡۨۥ;

    if-eqz v2, :cond_9

    invoke-virtual {p1, v0}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۠ۤ(Ljava/lang/Object;)LYue/ۥۣۣۢ۟;

    move-result-object v0

    invoke-virtual {p1, p2, v0, v4, v5}, LYue/ۥ۠ۧۡۤ;->ۥۣ۟۟۟(LYue/ۥۣۣۢ۟;LYue/ۥۣۣۢ۟;II)V

    invoke-virtual {p1, v1, p2, v4, v5}, LYue/ۥ۠ۧۡۤ;->ۥۣ۟۟۟(LYue/ۥۣۣۢ۟;LYue/ۥۣۣۢ۟;II)V

    goto :goto_3

    :cond_8
    iget p2, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۢ:F

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float p2, p2, v0

    if-eqz p2, :cond_9

    iget-object p2, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {p1, p2}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۠ۤ(Ljava/lang/Object;)LYue/ۥۣۣۢ۟;

    move-result-object p2

    invoke-virtual {p1, v1}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۠ۤ(Ljava/lang/Object;)LYue/ۥۣۣۢ۟;

    move-result-object v0

    iget v1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۢ:F

    invoke-static {p1, p2, v0, v1}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۠ۦ(LYue/ۥ۠ۧۡۤ;LYue/ۥۣۣۢ۟;LYue/ۥۣۣۢ۟;F)LYue/ۥ۟ۡۨۥ;

    move-result-object p2

    invoke-virtual {p1, p2}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟۟(LYue/ۥ۟ۡۨۥ;)V

    :cond_9
    :goto_3
    return-void
.end method

.method public ۥ۟۟۟ۢ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۟۟ۨ(LYue/ۥ۟ۧ۟ۢ;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06df\u06e2;",
            "Ljava/util/HashMap<",
            "LYue/\u06e5\u06df\u06e7\u06df\u06e2;",
            "LYue/\u06e5\u06df\u06e7\u06df\u06e2;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۟ۨ(LYue/ۥ۟ۧ۟ۢ;Ljava/util/HashMap;)V

    check-cast p1, LYue/ۥ۠ۤ۟ۧ;

    iget p2, p1, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۢ:F

    iput p2, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۢ:F

    iget p2, p1, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠۟:I

    iput p2, p0, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠۟:I

    iget p2, p1, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۤ:I

    iput p2, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۤ:I

    iget p1, p1, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۦ:I

    invoke-virtual {p0, p1}, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠ۡ(I)V

    return-void
.end method

.method public ۥ۟۟۠ۡ(LYue/ۥ۟ۧ۟۠$ۥ۟;)LYue/ۥ۟ۧ۟۠;
    .locals 2

    sget-object v0, LYue/ۥ۠ۤ۟ۧ$ۥ;->ۥ:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    iget v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۦ:I

    if-nez v0, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    return-object p1

    :pswitch_2
    iget v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۦ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    return-object p1

    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public ۥۣ۟۟ۥ()Ljava/lang/String;
    .locals 1

    const-string v0, "Guideline"

    return-object v0
.end method

.method public ۥ۟۟ۥۤ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۨ:Z

    return v0
.end method

.method public ۥ۟۟ۥۥ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۨ:Z

    return v0
.end method

.method public ۥ۟۠ۡۥ(LYue/ۥ۠ۧۡۤ;Z)V
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۨ()LYue/ۥ۟ۧ۟ۢ;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {p1, p2}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟ۢۢ(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۦ:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۠ۡۡ(I)V

    invoke-virtual {p0, v1}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۠ۡۢ(I)V

    invoke-virtual {p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۨ()LYue/ۥ۟ۧ۟ۢ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۡۢ()I

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۧ۟ۢ;->ۥۣ۟۟ۨ(I)V

    invoke-virtual {p0, v1}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۠ۡ۟(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۠ۡۡ(I)V

    invoke-virtual {p0, p1}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۠ۡۢ(I)V

    invoke-virtual {p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۨ()LYue/ۥ۟ۧ۟ۢ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۤۡ()I

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۠ۡ۟(I)V

    invoke-virtual {p0, v1}, LYue/ۥ۟ۧ۟ۢ;->ۥۣ۟۟ۨ(I)V

    :goto_0
    return-void
.end method

.method public ۥ۟۠ۡۦ()V
    .locals 3

    iget v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠۟:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠ۢۤ()V

    goto :goto_0

    :cond_0
    iget v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۢ:F

    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠ۢ()V

    goto :goto_0

    :cond_1
    iget v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۤ:I

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠ۢۢ()V

    :cond_2
    :goto_0
    return-void
.end method

.method public ۥ۟۠ۡۧ()LYue/ۥ۟ۧ۟۠;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    return-object v0
.end method

.method public ۥ۟۠ۡۨ()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۦ:I

    return v0
.end method

.method public ۥ۟۠ۢ()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠۟:I

    return v0
.end method

.method public ۥ۟۠ۢ۟()I
    .locals 2

    iget v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۢ:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠۟:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    iget v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۤ:I

    if-eq v0, v1, :cond_2

    const/4 v0, 0x2

    return v0

    :cond_2
    return v1
.end method

.method public ۥ۟۠ۢ۠()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۤ:I

    return v0
.end method

.method public ۥ۟۠ۢۡ()F
    .locals 1

    iget v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۢ:F

    return v0
.end method

.method public ۥ۟۠ۢۢ()V
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۤۢ()I

    move-result v0

    iget v1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۦ:I

    if-nez v1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟ۧ۟ۢ;->ۥۣ۟۟ۤ()I

    move-result v0

    :cond_0
    invoke-virtual {p0, v0}, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠ۢۧ(I)V

    return-void
.end method

.method public ۥۣ۟۠ۢ()V
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۨ()LYue/ۥ۟ۧ۟ۢ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۤۡ()I

    move-result v0

    invoke-virtual {p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۤۢ()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۦ:I

    if-nez v1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۨ()LYue/ۥ۟ۧ۟ۢ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۡۢ()I

    move-result v0

    invoke-virtual {p0}, LYue/ۥ۟ۧ۟ۢ;->ۥۣ۟۟ۤ()I

    move-result v1

    sub-int/2addr v0, v1

    :cond_0
    invoke-virtual {p0, v0}, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠ۢۨ(I)V

    return-void
.end method

.method public ۥ۟۠ۢۤ()V
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۤۢ()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۨ()LYue/ۥ۟ۧ۟ۢ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۤۡ()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget v1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۦ:I

    if-nez v1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟ۧ۟ۢ;->ۥۣ۟۟ۤ()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۨ()LYue/ۥ۟ۧ۟ۢ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۡۢ()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    :cond_0
    invoke-virtual {p0, v0}, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠(F)V

    return-void
.end method

.method public ۥ۟۠ۢۥ()Z
    .locals 2

    iget v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۢ:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    iget v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠۟:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۤ:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۠ۢۦ(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟ۡ۟(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۨ:Z

    return-void
.end method

.method public ۥ۟۠ۢۧ(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۢ:F

    iput p1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠۟:I

    iput v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۤ:I

    :cond_0
    return-void
.end method

.method public ۥ۟۠ۢۨ(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۢ:F

    iput v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠۟:I

    iput p1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۤ:I

    :cond_0
    return-void
.end method

.method public ۥۣ۟۠(F)V
    .locals 1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    iput p1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۢ:F

    const/4 p1, -0x1

    iput p1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠۟:I

    iput p1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۤ:I

    :cond_0
    return-void
.end method

.method public ۥۣ۟۠۟(I)V
    .locals 1

    int-to-float p1, p1

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p1, v0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۤ۟ۧ;->ۥۣ۟۠(F)V

    return-void
.end method

.method public ۥۣ۟۠۠(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۧ:I

    return-void
.end method

.method public ۥۣ۟۠ۡ(I)V
    .locals 3

    iget v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۦ:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۦ:I

    iget-object p1, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۦ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget p1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۦ:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۡۨ:LYue/ۥ۟ۧ۟۠;

    iput-object p1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    goto :goto_0

    :cond_1
    iget-object p1, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢ:LYue/ۥ۟ۧ۟۠;

    iput-object p1, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    :goto_0
    iget-object p1, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۦ:Ljava/util/ArrayList;

    iget-object v0, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۥ:[LYue/ۥ۟ۧ۟۠;

    array-length p1, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_2

    iget-object v1, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۥ:[LYue/ۥ۟ۧ۟۠;

    iget-object v2, p0, LYue/ۥ۠ۤ۟ۧ;->ۥ۟۠۟ۥ:LYue/ۥ۟ۧ۟۠;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method
