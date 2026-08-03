.class public final LN0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV0/h;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LV0/e;Ljava/util/Comparator;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LN0/i;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, LN0/i;->b:Ljava/lang/Object;

    iput-object p2, p0, LN0/i;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LW0/e;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LN0/i;->a:I

    sget-object v0, LW0/f;->i:LW0/f;

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN0/i;->b:Ljava/lang/Object;

    iput-object v0, p0, LN0/i;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LN0/i;->a:I

    sget-object v0, LN0/j;->a:LN0/j;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LN0/i;->b:Ljava/lang/Object;

    .line 3
    iput-object v0, p0, LN0/i;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    iget v0, p0, LN0/i;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "<this>"

    iget-object v1, p0, LN0/i;->b:Ljava/lang/Object;

    check-cast v1, LV0/h;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, LV0/h;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v1, p0, LN0/i;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Comparator;

    invoke-static {v0, v1}, LE0/r;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, LV0/g;

    invoke-direct {v0, p0}, LV0/g;-><init>(LN0/i;)V

    return-object v0

    :pswitch_1
    new-instance v0, LN0/g;

    invoke-direct {v0, p0}, LN0/g;-><init>(LN0/i;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
