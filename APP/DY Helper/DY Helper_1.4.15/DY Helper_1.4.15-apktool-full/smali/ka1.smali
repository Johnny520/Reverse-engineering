.class public final Lka1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Iterator;
.implements Llo0;


# instance fields
.field public final ε:Lia1;


# direct methods
.method public constructor <init>(Lfa1;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    new-array v1, v0, [La62;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v0, :cond_0

    .line 10
    .line 11
    new-instance v3, Lc62;

    .line 12
    .line 13
    invoke-direct {v3, p0}, Lc62;-><init>(Lka1;)V

    .line 14
    .line 15
    .line 16
    aput-object v3, v1, v2

    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Lia1;

    .line 22
    .line 23
    invoke-direct {v0, p1, v1}, Lia1;-><init>(Lfa1;[La62;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lka1;->ε:Lia1;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lka1;->ε:Lia1;

    .line 2
    .line 3
    iget-boolean p0, p0, Lha1;->η:Z

    .line 4
    .line 5
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lka1;->ε:Lia1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lia1;->next()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/Map$Entry;

    .line 8
    .line 9
    return-object p0
.end method

.method public final remove()V
    .locals 0

    .line 1
    iget-object p0, p0, Lka1;->ε:Lia1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lia1;->remove()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
