.class public final synthetic Lut1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic ε:Ljava/util/List;

.field public final synthetic ζ:Ljava/util/LinkedHashMap;

.field public final synthetic η:Lzc0;

.field public final synthetic θ:Landroid/widget/TextView;

.field public final synthetic ι:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Lzc0;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/LinkedHashMap;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, Lut1;->ε:Ljava/util/List;

    .line 5
    .line 6
    iput-object p4, p0, Lut1;->ζ:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    iput-object p1, p0, Lut1;->η:Lzc0;

    .line 9
    .line 10
    iput-object p2, p0, Lut1;->θ:Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p3, p0, Lut1;->ι:Landroid/widget/TextView;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lut1;->ε:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lku1;

    .line 8
    .line 9
    iget-object p2, p2, Lku1;->α:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p3, p0, Lut1;->ζ:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-virtual {p3, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    check-cast p4, Ljava/lang/Boolean;

    .line 18
    .line 19
    if-eqz p4, :cond_0

    .line 20
    .line 21
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p4, 0x0

    .line 27
    :goto_0
    xor-int/lit8 p4, p4, 0x1

    .line 28
    .line 29
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object p4

    .line 33
    invoke-interface {p3, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, Lut1;->η:Lzc0;

    .line 37
    .line 38
    invoke-virtual {p2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 39
    .line 40
    .line 41
    iget-object p2, p0, Lut1;->θ:Landroid/widget/TextView;

    .line 42
    .line 43
    iget-object p0, p0, Lut1;->ι:Landroid/widget/TextView;

    .line 44
    .line 45
    invoke-static {p2, p1, p0, p3}, Lbv1;->Π(Landroid/widget/TextView;Ljava/util/List;Landroid/widget/TextView;Ljava/util/LinkedHashMap;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method
