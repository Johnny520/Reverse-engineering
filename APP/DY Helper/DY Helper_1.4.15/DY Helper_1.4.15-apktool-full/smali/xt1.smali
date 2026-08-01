.class public final synthetic Lxt1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic ε:Lum1;

.field public final synthetic ζ:Ljava/util/HashSet;

.field public final synthetic η:Ljava/util/LinkedHashSet;

.field public final synthetic θ:Lzc0;

.field public final synthetic ι:Lum1;

.field public final synthetic κ:Landroid/widget/TextView;

.field public final synthetic λ:Lqm1;

.field public final synthetic μ:Landroid/widget/TextView;

.field public final synthetic ν:Lum1;

.field public final synthetic ξ:Lum1;

.field public final synthetic ο:Landroid/widget/TextView;

.field public final synthetic π:Landroid/widget/TextView;

.field public final synthetic ρ:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lum1;Ljava/util/HashSet;Ljava/util/LinkedHashSet;Lzc0;Lum1;Landroid/widget/TextView;Lqm1;Landroid/widget/TextView;Lum1;Lum1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxt1;->ε:Lum1;

    .line 5
    .line 6
    iput-object p2, p0, Lxt1;->ζ:Ljava/util/HashSet;

    .line 7
    .line 8
    iput-object p3, p0, Lxt1;->η:Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    iput-object p4, p0, Lxt1;->θ:Lzc0;

    .line 11
    .line 12
    iput-object p5, p0, Lxt1;->ι:Lum1;

    .line 13
    .line 14
    iput-object p6, p0, Lxt1;->κ:Landroid/widget/TextView;

    .line 15
    .line 16
    iput-object p7, p0, Lxt1;->λ:Lqm1;

    .line 17
    .line 18
    iput-object p8, p0, Lxt1;->μ:Landroid/widget/TextView;

    .line 19
    .line 20
    iput-object p9, p0, Lxt1;->ν:Lum1;

    .line 21
    .line 22
    iput-object p10, p0, Lxt1;->ξ:Lum1;

    .line 23
    .line 24
    iput-object p11, p0, Lxt1;->ο:Landroid/widget/TextView;

    .line 25
    .line 26
    iput-object p12, p0, Lxt1;->π:Landroid/widget/TextView;

    .line 27
    .line 28
    iput-object p13, p0, Lxt1;->ρ:Landroid/view/View;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 11

    .line 1
    iget-object v1, p0, Lxt1;->ε:Lum1;

    .line 2
    .line 3
    iget-object p1, v1, Lum1;->ε:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Ljava/util/List;

    .line 6
    .line 7
    invoke-static {p3, p1}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Llu1;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p1, p1, Llu1;->β:Ljava/lang/String;

    .line 17
    .line 18
    const/4 p3, 0x3

    .line 19
    invoke-virtual {p2, p3}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 20
    .line 21
    .line 22
    iget-object p2, p0, Lxt1;->ζ:Ljava/util/HashSet;

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    iget-object v10, p0, Lxt1;->η:Ljava/util/LinkedHashSet;

    .line 28
    .line 29
    invoke-virtual {v10, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    invoke-virtual {v10, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {v10, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object p1, p0, Lxt1;->θ:Lzc0;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lxt1;->ι:Lum1;

    .line 48
    .line 49
    iget-object v2, p0, Lxt1;->κ:Landroid/widget/TextView;

    .line 50
    .line 51
    iget-object v3, p0, Lxt1;->λ:Lqm1;

    .line 52
    .line 53
    iget-object v4, p0, Lxt1;->μ:Landroid/widget/TextView;

    .line 54
    .line 55
    iget-object v5, p0, Lxt1;->ν:Lum1;

    .line 56
    .line 57
    iget-object v6, p0, Lxt1;->ξ:Lum1;

    .line 58
    .line 59
    iget-object v7, p0, Lxt1;->ο:Landroid/widget/TextView;

    .line 60
    .line 61
    iget-object v8, p0, Lxt1;->π:Landroid/widget/TextView;

    .line 62
    .line 63
    iget-object v9, p0, Lxt1;->ρ:Landroid/view/View;

    .line 64
    .line 65
    invoke-static/range {v0 .. v10}, Lbv1;->Τ(Lum1;Lum1;Landroid/widget/TextView;Lqm1;Landroid/widget/TextView;Lum1;Lum1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Ljava/util/LinkedHashSet;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method
