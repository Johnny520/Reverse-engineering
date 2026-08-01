.class public abstract Lio/github/libxposed/service/IXposedService$Stub;
.super Landroid/os/Binder;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lio/github/libxposed/service/IXposedService;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/libxposed/service/IXposedService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/libxposed/service/IXposedService$Stub$Proxy;
    }
.end annotation


# static fields
.field static final TRANSACTION_deleteRemoteFile:I = 0x21

.field static final TRANSACTION_deleteRemotePreferences:I = 0x17

.field static final TRANSACTION_getApiVersion:I = 0x2

.field static final TRANSACTION_getFrameworkName:I = 0x3

.field static final TRANSACTION_getFrameworkProperties:I = 0x6

.field static final TRANSACTION_getFrameworkVersion:I = 0x4

.field static final TRANSACTION_getFrameworkVersionCode:I = 0x5

.field static final TRANSACTION_getScope:I = 0xb

.field static final TRANSACTION_listRemoteFiles:I = 0x1f

.field static final TRANSACTION_openRemoteFile:I = 0x20

.field static final TRANSACTION_removeScope:I = 0xd

.field static final TRANSACTION_requestRemotePreferences:I = 0x15

.field static final TRANSACTION_requestScope:I = 0xc

.field static final TRANSACTION_updateRemotePreferences:I = 0x16


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "io.github.libxposed.service.IXposedService"

    .line 5
    .line 6
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lio/github/libxposed/service/IXposedService;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string v0, "io.github.libxposed.service.IXposedService"

    .line 6
    .line 7
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    instance-of v1, v0, Lio/github/libxposed/service/IXposedService;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast v0, Lio/github/libxposed/service/IXposedService;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    new-instance v0, Lio/github/libxposed/service/IXposedService$Stub$Proxy;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lio/github/libxposed/service/IXposedService$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3

    .line 1
    const-string v0, "io.github.libxposed.service.IXposedService"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-lt p1, v1, :cond_0

    .line 5
    .line 6
    const v2, 0xffffff

    .line 7
    .line 8
    .line 9
    if-gt p1, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const v2, 0x5f4e5446

    .line 15
    .line 16
    .line 17
    if-ne p1, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return v1

    .line 23
    :cond_1
    const/4 v0, 0x2

    .line 24
    if-eq p1, v0, :cond_6

    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    if-eq p1, v0, :cond_5

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    if-eq p1, v0, :cond_4

    .line 31
    .line 32
    const/4 v0, 0x5

    .line 33
    if-eq p1, v0, :cond_3

    .line 34
    .line 35
    const/4 v0, 0x6

    .line 36
    if-eq p1, v0, :cond_2

    .line 37
    .line 38
    packed-switch p1, :pswitch_data_0

    .line 39
    .line 40
    .line 41
    packed-switch p1, :pswitch_data_1

    .line 42
    .line 43
    .line 44
    packed-switch p1, :pswitch_data_2

    .line 45
    .line 46
    .line 47
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0

    .line 52
    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p0, p1}, Lio/github/libxposed/service/IXposedService;->deleteRemoteFile(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3, p0}, Landroid/os/Parcel;->writeInt(I)V

    .line 64
    .line 65
    .line 66
    return v1

    .line 67
    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {p0, p1}, Lio/github/libxposed/service/IXposedService;->openRemoteFile(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 76
    .line 77
    .line 78
    invoke-static {p3, p0, v1}, Lio/github/libxposed/service/IXposedService$_Parcel;->b(Landroid/os/Parcel;Landroid/os/Parcelable;I)V

    .line 79
    .line 80
    .line 81
    return v1

    .line 82
    :pswitch_2
    invoke-interface {p0}, Lio/github/libxposed/service/IXposedService;->listRemoteFiles()[Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p3, p0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return v1

    .line 93
    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-interface {p0, p1}, Lio/github/libxposed/service/IXposedService;->deleteRemotePreferences(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 101
    .line 102
    .line 103
    return v1

    .line 104
    :pswitch_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 109
    .line 110
    invoke-static {p2, p4}, Lio/github/libxposed/service/IXposedService$_Parcel;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    check-cast p2, Landroid/os/Bundle;

    .line 115
    .line 116
    invoke-interface {p0, p1, p2}, Lio/github/libxposed/service/IXposedService;->updateRemotePreferences(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 120
    .line 121
    .line 122
    return v1

    .line 123
    :pswitch_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-interface {p0, p1}, Lio/github/libxposed/service/IXposedService;->requestRemotePreferences(Ljava/lang/String;)Landroid/os/Bundle;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 132
    .line 133
    .line 134
    invoke-static {p3, p0, v1}, Lio/github/libxposed/service/IXposedService$_Parcel;->b(Landroid/os/Parcel;Landroid/os/Parcelable;I)V

    .line 135
    .line 136
    .line 137
    return v1

    .line 138
    :pswitch_6
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-interface {p0, p1}, Lio/github/libxposed/service/IXposedService;->removeScope(Ljava/util/List;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 146
    .line 147
    .line 148
    return v1

    .line 149
    :pswitch_7
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    invoke-static {p2}, Lio/github/libxposed/service/IXposedScopeCallback$Stub;->asInterface(Landroid/os/IBinder;)Lio/github/libxposed/service/IXposedScopeCallback;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    invoke-interface {p0, p1, p2}, Lio/github/libxposed/service/IXposedService;->requestScope(Ljava/util/List;Lio/github/libxposed/service/IXposedScopeCallback;)V

    .line 162
    .line 163
    .line 164
    return v1

    .line 165
    :pswitch_8
    invoke-interface {p0}, Lio/github/libxposed/service/IXposedService;->getScope()Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p3, p0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 173
    .line 174
    .line 175
    return v1

    .line 176
    :cond_2
    invoke-interface {p0}, Lio/github/libxposed/service/IXposedService;->getFrameworkProperties()J

    .line 177
    .line 178
    .line 179
    move-result-wide p0

    .line 180
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p3, p0, p1}, Landroid/os/Parcel;->writeLong(J)V

    .line 184
    .line 185
    .line 186
    return v1

    .line 187
    :cond_3
    invoke-interface {p0}, Lio/github/libxposed/service/IXposedService;->getFrameworkVersionCode()J

    .line 188
    .line 189
    .line 190
    move-result-wide p0

    .line 191
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p3, p0, p1}, Landroid/os/Parcel;->writeLong(J)V

    .line 195
    .line 196
    .line 197
    return v1

    .line 198
    :cond_4
    invoke-interface {p0}, Lio/github/libxposed/service/IXposedService;->getFrameworkVersion()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p3, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    return v1

    .line 209
    :cond_5
    invoke-interface {p0}, Lio/github/libxposed/service/IXposedService;->getFrameworkName()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p3, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    return v1

    .line 220
    :cond_6
    invoke-interface {p0}, Lio/github/libxposed/service/IXposedService;->getApiVersion()I

    .line 221
    .line 222
    .line 223
    move-result p0

    .line 224
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p3, p0}, Landroid/os/Parcel;->writeInt(I)V

    .line 228
    .line 229
    .line 230
    return v1

    .line 231
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    :pswitch_data_2
    .packed-switch 0x1f
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
