.class public LYue/ۥ۟ۢۤۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/autofill/AutofillId;)V
    .locals 0
    .param p1    # Landroid/view/autofill/AutofillId;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۢۤۢ;->ۥ:Ljava/lang/Object;

    return-void
.end method

.method public static ۥ۟(Landroid/view/autofill/AutofillId;)LYue/ۥ۟ۢۤۢ;
    .locals 1
    .param p0    # Landroid/view/autofill/AutofillId;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    new-instance v0, LYue/ۥ۟ۢۤۢ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۢۤۢ;-><init>(Landroid/view/autofill/AutofillId;)V

    return-object v0
.end method


# virtual methods
.method public ۥ()Landroid/view/autofill/AutofillId;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢۤۢ;->ۥ:Ljava/lang/Object;

    check-cast v0, Landroid/view/autofill/AutofillId;

    return-object v0
.end method
