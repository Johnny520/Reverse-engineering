.class public LYue/ۥۣ۠۟ۢ$ۥ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠۟ۢ$ۥ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "LYue/\u06e5\u06e0\u06e3\u06df\u06e2$\u06e5\u06df;",
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

    invoke-virtual {p0, p1}, LYue/ۥۣ۠۟ۢ$ۥ۟$ۥ;->ۥ(Landroid/os/Parcel;)LYue/ۥۣ۠۟ۢ$ۥ۟;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۣ۠۟ۢ$ۥ۟$ۥ;->ۥ۟(I)[LYue/ۥۣ۠۟ۢ$ۥ۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ(Landroid/os/Parcel;)LYue/ۥۣ۠۟ۢ$ۥ۟;
    .locals 1

    new-instance v0, LYue/ۥۣ۠۟ۢ$ۥ۟;

    invoke-direct {v0, p1}, LYue/ۥۣ۠۟ۢ$ۥ۟;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public ۥ۟(I)[LYue/ۥۣ۠۟ۢ$ۥ۟;
    .locals 0

    new-array p1, p1, [LYue/ۥۣ۠۟ۢ$ۥ۟;

    return-object p1
.end method
