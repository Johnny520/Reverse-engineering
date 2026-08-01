.class public final Lm4;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lhq1;


# instance fields
.field public final synthetic α:I

.field public final β:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AppCompatActivity;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm4;->α:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm4;->β:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln5;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lm4;->α:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lm4;->β:Ljava/lang/Object;

    .line 13
    .line 14
    const-string v0, "androidx.savedstate.Restarter"

    .line 15
    .line 16
    invoke-virtual {p1, v0, p0}, Ln5;->Σ(Ljava/lang/String;Lhq1;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final α()Landroid/os/Bundle;
    .locals 2

    .line 1
    iget v0, p0, Lm4;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    new-array v1, v0, [Ll91;

    .line 8
    .line 9
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, [Ll91;

    .line 14
    .line 15
    invoke-static {v0}, Ljx0;->κ([Ll91;)Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object p0, p0, Lm4;->β:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    instance-of v1, p0, Ljava/util/ArrayList;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    check-cast p0, Ljava/util/ArrayList;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 37
    .line 38
    .line 39
    move-object p0, v1

    .line 40
    :goto_0
    const-string v1, "classes_to_restore"

    .line 41
    .line 42
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_0
    new-instance v0, Landroid/os/Bundle;

    .line 47
    .line 48
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Lm4;->β:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Landroidx/appcompat/app/AppCompatActivity;

    .line 54
    .line 55
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
