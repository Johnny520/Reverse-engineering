.class public final LYue/ۥ۠ۥۦۣ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۥۦۣ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "LYue/\u06e5\u06e0\u06e5\u06e6\u06e3;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۥۦۣ$ۥ۟;->ۥ(Landroid/os/Parcel;)LYue/ۥ۠ۥۦۣ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۥۦۣ$ۥ۟;->ۥ۟(I)[LYue/ۥ۠ۥۦۣ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ(Landroid/os/Parcel;)LYue/ۥ۠ۥۦۣ;
    .locals 1
    .param p1    # Landroid/os/Parcel;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "inParcel"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۥۦۣ;

    invoke-direct {v0, p1}, LYue/ۥ۠ۥۦۣ;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public ۥ۟(I)[LYue/ۥ۠ۥۦۣ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-array p1, p1, [LYue/ۥ۠ۥۦۣ;

    return-object p1
.end method
