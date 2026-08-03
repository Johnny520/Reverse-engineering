.class public final synthetic Lmd/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lmd/f;


# direct methods
.method public synthetic constructor <init>(Lmd/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lmd/d;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lmd/d;->b:Lmd/f;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lmd/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/Map;

    .line 7
    .line 8
    iget-object v0, p0, Lmd/d;->b:Lmd/f;

    .line 9
    .line 10
    iget-object v0, v0, Lmd/f;->b:Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lmd/d;->b:Lmd/f;

    .line 17
    .line 18
    sget-object v1, Lmd/b;->t:Lmd/b;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lmd/c;

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    new-instance v2, Lmd/c;

    .line 29
    .line 30
    invoke-direct {v2, v1}, Lmd/c;-><init>(Lmd/b;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lae/g;

    .line 34
    .line 35
    const/16 v3, 0xc

    .line 36
    .line 37
    invoke-direct {v1, v2, v3}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lmd/f;->i(Ljava/util/function/Consumer;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    iget-object v0, v2, Lmd/c;->h:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
