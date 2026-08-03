.class public final synthetic LdG;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:[Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, LdG;->a:I

    iput-object p1, p0, LdG;->b:[Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, LdG;->a:I

    check-cast p1, [Ljava/lang/Class;

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x20ca8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    array-length v0, p1

    iget-object v1, p0, LdG;->b:[Ljava/lang/Object;

    array-length v2, v1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_3

    array-length v0, v1

    move v2, v3

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v4, v1, v2

    if-eqz v4, :cond_1

    instance-of v5, v4, Ljava/lang/Class;

    if-eqz v5, :cond_0

    check-cast v4, Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_0
    check-cast v4, Ljava/lang/String;

    :goto_1
    aget-object v5, p1, v2

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x1

    :cond_3
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-wide v0, -0x20e0afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    array-length v0, p1

    iget-object v1, p0, LdG;->b:[Ljava/lang/Object;

    array-length v2, v1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_7

    array-length v0, v1

    move v2, v3

    :goto_3
    if-ge v2, v0, :cond_6

    aget-object v4, v1, v2

    if-eqz v4, :cond_5

    instance-of v5, v4, Ljava/lang/Class;

    if-eqz v5, :cond_4

    check-cast v4, Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    :cond_4
    check-cast v4, Ljava/lang/String;

    :goto_4
    aget-object v5, p1, v2

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_5

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    const/4 v3, 0x1

    :cond_7
    :goto_5
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
