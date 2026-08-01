.class public final synthetic Lcom/example/dyhelper/ui/α;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

.field public final synthetic ζ:I


# direct methods
.method public synthetic constructor <init>(Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/ui/α;->ε:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 5
    .line 6
    iput p2, p0, Lcom/example/dyhelper/ui/α;->ζ:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/ui/α;->ε:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ε:Z

    .line 4
    .line 5
    iget p0, p0, Lcom/example/dyhelper/ui/α;->ζ:I

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/16 v1, 0xff

    .line 15
    .line 16
    :goto_0
    iput v1, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ι:I

    .line 17
    .line 18
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-virtual {v0, v1, v2, p0, v3}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->α(IIIZ)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Ls62;->α:Ls62;

    .line 35
    .line 36
    return-object p0
.end method
