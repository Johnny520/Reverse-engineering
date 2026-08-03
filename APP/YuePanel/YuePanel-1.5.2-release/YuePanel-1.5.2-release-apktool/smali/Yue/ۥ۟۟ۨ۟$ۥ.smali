.class public LYue/ۥ۟۟ۨ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۨ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "LYue/\u06e5\u06df\u06df\u06e8\u06df;",
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
    .param p1    # Landroid/os/Parcel;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, LYue/ۥ۟۟ۨ۟$ۥ;->ۥ(Landroid/os/Parcel;)LYue/ۥ۟۟ۨ۟;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۟۟ۨ۟$ۥ;->ۥ۟(I)[LYue/ۥ۟۟ۨ۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ(Landroid/os/Parcel;)LYue/ۥ۟۟ۨ۟;
    .locals 1
    .param p1    # Landroid/os/Parcel;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    new-instance v0, LYue/ۥ۟۟ۨ۟;

    invoke-direct {v0, p1}, LYue/ۥ۟۟ۨ۟;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public ۥ۟(I)[LYue/ۥ۟۟ۨ۟;
    .locals 0

    new-array p1, p1, [LYue/ۥ۟۟ۨ۟;

    return-object p1
.end method
