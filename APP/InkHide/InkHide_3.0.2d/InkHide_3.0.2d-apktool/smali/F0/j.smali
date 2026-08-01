.class public final LF0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT0/h;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LF0/j;->a:I

    iput-object p2, p0, LF0/j;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    iget v0, p0, LF0/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LF0/j;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LT0/h;

    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, LT0/h;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v2, 0x1

    .line 38
    if-le v0, v2, :cond_1

    .line 39
    .line 40
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :pswitch_0
    iget-object v0, p0, LF0/j;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/util/Iterator;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_1
    iget-object v0, p0, LF0/j;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Ljava/util/Collection;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0

    .line 62
    :pswitch_2
    iget-object v0, p0, LF0/j;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, [Ljava/lang/Object;

    .line 65
    .line 66
    invoke-static {v0}, LN0/o;->d([Ljava/lang/Object;)LF0/c;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
