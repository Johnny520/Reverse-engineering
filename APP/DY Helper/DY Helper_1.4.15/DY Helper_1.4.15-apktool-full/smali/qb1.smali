.class public final synthetic Lqb1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic α:Landroid/widget/Switch;

.field public final synthetic β:Landroid/app/Activity;

.field public final synthetic γ:Lod;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/Switch;Landroid/app/Activity;Lod;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqb1;->α:Landroid/widget/Switch;

    .line 5
    .line 6
    iput-object p2, p0, Lqb1;->β:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Lqb1;->γ:Lod;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lx9;->ζ()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iget-object v0, p0, Lqb1;->β:Landroid/app/Activity;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lqb1;->α:Landroid/widget/Switch;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 16
    .line 17
    .line 18
    const-string p0, "\u5185\u6d4b\u8d44\u683c\u5df2\u5931\u6548"

    .line 19
    .line 20
    invoke-static {v0, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-static {}, Lui1;->Α()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/4 v1, 0x1

    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iget-object p0, p0, Lqb1;->γ:Lod;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_4

    .line 43
    .line 44
    if-eq p0, v1, :cond_3

    .line 45
    .line 46
    const/4 p1, 0x2

    .line 47
    if-ne p0, p1, :cond_2

    .line 48
    .line 49
    const-string p0, "pet_elf_camp_auto_water"

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-static {}, Lγ;->κ()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    const-string p0, "pet_elf_camp_auto_plant"

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_4
    const-string p0, "pet_elf_camp_auto_harvest"

    .line 60
    .line 61
    :goto_0
    invoke-static {p0, p2}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lxn0;->Ψ()V

    .line 65
    .line 66
    .line 67
    :goto_1
    sget-object p0, Ldd1;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 68
    .line 69
    sget-object p0, Ljc1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 70
    .line 71
    invoke-static {}, Ljc1;->κ()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    xor-int/2addr p0, v1

    .line 80
    invoke-static {v0, p0}, Ldd1;->ε(Landroid/app/Activity;Z)V

    .line 81
    .line 82
    .line 83
    return-void
.end method
