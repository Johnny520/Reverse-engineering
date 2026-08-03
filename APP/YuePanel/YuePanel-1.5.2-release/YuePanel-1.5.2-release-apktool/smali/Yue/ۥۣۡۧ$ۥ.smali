.class public LYue/ۥۣۡۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۡۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۣۡۧ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06df<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣۡۧ۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06df<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۡۧ$ۥ;->ۥ:LYue/ۥۣۡۧ۟;

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, LYue/ۥۣۡۧ$ۥ;->ۥ:LYue/ۥۣۡۧ۟;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, LYue/ۥۣۡۧ۟;->createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            "Ljava/lang/ClassLoader;",
            ")TT;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, LYue/ۥۣۡۧ$ۥ;->ۥ:LYue/ۥۣۡۧ۟;

    invoke-interface {v0, p1, p2}, LYue/ۥۣۡۧ۟;->createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[TT;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۧ$ۥ;->ۥ:LYue/ۥۣۡۧ۟;

    invoke-interface {v0, p1}, LYue/ۥۣۡۧ۟;->newArray(I)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
