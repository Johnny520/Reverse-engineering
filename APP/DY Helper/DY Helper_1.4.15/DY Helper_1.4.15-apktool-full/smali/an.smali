.class public final Lan;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;
.implements Lf80;
.implements Lg80;
.implements Lh80;
.implements Li80;
.implements Lj80;
.implements Lk80;
.implements Ll80;
.implements Lq70;
.implements Lr70;
.implements Lt70;
.implements Lu70;
.implements Lv70;
.implements Lw70;
.implements Lx70;
.implements Ly70;
.implements Lz70;
.implements Lb80;
.implements Lc80;


# instance fields
.field public final ε:I

.field public final ζ:Z

.field public η:Lm80;

.field public θ:Lbl1;

.field public ι:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(IZLm80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lan;->ε:I

    .line 5
    .line 6
    iput-boolean p2, p0, Lan;->ζ:Z

    .line 7
    .line 8
    iput-object p3, p0, Lan;->η:Lm80;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lv80;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0, p1, p2}, Lan;->β(Lv80;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final bridge synthetic α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Lv80;

    .line 2
    .line 3
    check-cast p3, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    invoke-virtual {p0, p1, p2, p3}, Lan;->γ(Ljava/lang/Object;Lv80;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final β(Lv80;I)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lan;->ε:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lv80;->Χ(I)Lv80;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lan;->ζ(Lv80;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lv80;->ε(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {v1, v2}, Lkn0;->κ(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x1

    .line 23
    invoke-static {v0, v2}, Lkn0;->κ(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    :goto_0
    or-int/2addr p2, v0

    .line 28
    iget-object v0, p0, Lan;->η:Lm80;

    .line 29
    .line 30
    invoke-static {v1, v0}, Lh62;->κ(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    check-cast v0, Le80;

    .line 34
    .line 35
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-interface {v0, p1, p2}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1}, Lv80;->π()Lbl1;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    new-instance v0, Lzm;

    .line 50
    .line 51
    const-string v4, "invoke"

    .line 52
    .line 53
    const-string v5, "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;"

    .line 54
    .line 55
    const/4 v1, 0x2

    .line 56
    const-class v2, Lan;

    .line 57
    .line 58
    move-object v3, p0

    .line 59
    invoke-direct/range {v0 .. v5}, Lzm;-><init>(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p1, Lbl1;->δ:Le80;

    .line 63
    .line 64
    :cond_1
    return-object p2
.end method

.method public final γ(Ljava/lang/Object;Lv80;I)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lan;->ε:I

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lv80;->Χ(I)Lv80;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Lan;->ζ(Lv80;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p0}, Lv80;->ε(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    invoke-static {v0, v1}, Lkn0;->κ(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {v1, v1}, Lkn0;->κ(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :goto_0
    or-int/2addr v0, p3

    .line 27
    iget-object v1, p0, Lan;->η:Lm80;

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    invoke-static {v2, v1}, Lh62;->κ(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    check-cast v1, Lf80;

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v1, p1, p2, v0}, Lf80;->α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p2}, Lv80;->π()Lbl1;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    new-instance v1, Lym;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-direct {v1, p3, v2, p0, p1}, Lym;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, p2, Lbl1;->δ:Le80;

    .line 56
    .line 57
    :cond_1
    return-object v0
.end method

.method public final δ(Ljava/lang/Object;Ljava/lang/Object;Lv80;I)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lan;->ε:I

    .line 2
    .line 3
    invoke-virtual {p3, v0}, Lv80;->Χ(I)Lv80;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p3}, Lan;->ζ(Lv80;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3, p0}, Lv80;->ε(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {v1, v1}, Lkn0;->κ(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x1

    .line 22
    invoke-static {v0, v1}, Lkn0;->κ(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :goto_0
    or-int/2addr v0, p4

    .line 27
    iget-object v1, p0, Lan;->η:Lm80;

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    invoke-static {v2, v1}, Lh62;->κ(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    check-cast v1, Lg80;

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v1, p1, p2, p3, v0}, Lg80;->ε(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p3}, Lv80;->π()Lbl1;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    if-eqz p3, :cond_1

    .line 48
    .line 49
    new-instance v1, Ljc;

    .line 50
    .line 51
    invoke-direct {v1, p0, p1, p2, p4}, Ljc;-><init>(Lan;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p3, Lbl1;->δ:Le80;

    .line 55
    .line 56
    :cond_1
    return-object v0
.end method

.method public final bridge synthetic ε(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p3, Lv80;

    .line 2
    .line 3
    check-cast p4, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p4

    .line 9
    invoke-virtual {p0, p1, p2, p3, p4}, Lan;->δ(Ljava/lang/Object;Ljava/lang/Object;Lv80;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final ζ(Lv80;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lan;->ζ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    invoke-virtual {p1}, Lv80;->χ()Lbl1;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_4

    .line 10
    .line 11
    iget v0, p1, Lbl1;->β:I

    .line 12
    .line 13
    or-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    iput v0, p1, Lbl1;->β:I

    .line 16
    .line 17
    iget-object v0, p0, Lan;->θ:Lbl1;

    .line 18
    .line 19
    invoke-static {v0, p1}, Lkn0;->Ξ(Lbl1;Lbl1;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iput-object p1, p0, Lan;->θ:Lbl1;

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object v0, p0, Lan;->ι:Ljava/util/ArrayList;

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    new-instance v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lan;->ι:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    const/4 v1, 0x0

    .line 48
    :goto_0
    if-ge v1, p0, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Lbl1;

    .line 55
    .line 56
    invoke-static {v2, p1}, Lkn0;->Ξ(Lbl1;Lbl1;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    :cond_4
    return-void
.end method
