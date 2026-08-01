.class public final synthetic Lcom/example/dyhelper/ui/ι;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;


# direct methods
.method public synthetic constructor <init>(Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/ui/ι;->ε:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Float;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, Ljava/lang/Float;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget-object p0, p0, Lcom/example/dyhelper/ui/ι;->ε:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->θ:[F

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    aput p1, v0, v1

    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    aput p2, v0, p1

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ν()V

    .line 24
    .line 25
    .line 26
    sget-object p0, Ls62;->α:Ls62;

    .line 27
    .line 28
    return-object p0
.end method
