.class public final L۟/c5;
.super L۟/gb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/c5$a;
    }
.end annotation


# static fields
.field public static final synthetic ۥۡۧ:I


# instance fields
.field public final ۥۡ۠:Ljava/lang/String;

.field public final ۥۡۡ:L۟/g3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u06df/g3<",
            "Ljava/lang/String;",
            "L\u06df/vb;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥۡۢ:Ljava/lang/String;

.field public ۥۣۡ:Landroid/widget/EditText;

.field public ۥۡۤ:Landroid/widget/EditText;

.field public ۥۡۥ:Landroid/widget/Button;

.field public ۥۡۦ:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;L۟/ia;)V
    .locals 1

    const-string v0, "cxt"

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "textValue"

    invoke-static {v0, p3}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, L۟/gb;-><init>(Landroid/content/Context;Ljava/lang/CharSequence;)V

    iput-object p3, p0, L۟/c5;->ۥۡ۠:Ljava/lang/String;

    iput-object p4, p0, L۟/c5;->ۥۡۡ:L۟/g3;

    const-string p1, "<html>\n<head>\n    <meta http-equiv=\'Content-Type\' content=\'text/html\' charset=\'utf-8\'>\n    <script src=\'https://map.qq.com/api/gljs?v=2.exp&libraries=service&key=I2GBZ-CW43F-Y5OJB-NTEUL-PEES6-NNBL2\'></script>\n    <script>\n        var map,geocoder,markerGeo,markerLayer;\n\n        function getLocation() {\n            var position = map.getCenter();\n            if (position != null) {\n                var lat = position.getLat().toFixed(6).toString()\n                var lng = position.getLng().toFixed(6).toString()\n                window.java_obj.showLocation(lat, lng)\n            }\n        }\n\n        function setMapCenter(lat, lng) {\n            map.setCenter(new TMap.LatLng(lat, lng));\n            updateCenterMaker();\n        }\n\n        function updateCenterMaker() {\n            markerGeo.position = map.getCenter();\n            markerLayer.updateGeometries([markerGeo]);\n            getLocation();\n        }\n\n        function initMap() {\n            var center = new TMap.LatLng(39.908802, 116.397502)\n            map = new TMap.Map(document.getElementById(\'container\'), {\n                center: center,\n                // zoom: 17.2,  \n                // pitch: 43.5,\n                rotation: 45 \n            });\n            map.on(\'tilesloaded\', function () {\n                window.java_obj.tilesLoaded()\n            })\n\n            geocoder = new TMap.service.Geocoder();\n\n            markerGeo = {id: \'center\', position: map.getCenter()}\n            markerLayer = new TMap.MultiMarker({\n                map: map,\n                geometries: [markerGeo]\n            })\n\n            map.on(\'center_changed\', updateCenterMaker)\n        }\n\n        function searchAddr(addr) {\n            geocoder.getLocation({address: addr})\n                .then((result) => {\n                    map.setCenter(result.result.location)\n                    getLocation()\n                },(c) => {                   window.java_obj.showToast(\'address error:\'.concat(c.message));\n                })\n        }\n    </script>\n</head>\n<body onload=\'initMap()\'>\n<div id=\'container\'></div>\n</body>\n</html>"

    iput-object p1, p0, L۟/c5;->ۥۡۢ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final dismiss()V
    .locals 4

    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    iget-object v0, p0, L۟/c5;->ۥۡۦ:Landroid/webkit/WebView;

    const/4 v1, 0x0

    const-string v2, "mWebView"

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/webkit/WebView;->clearHistory()V

    iget-object v0, p0, L۟/c5;->ۥۡۦ:Landroid/webkit/WebView;

    if-eqz v0, :cond_3

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->clearCache(Z)V

    iget-object v0, p0, L۟/c5;->ۥۡۦ:Landroid/webkit/WebView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/webkit/WebView;->freeMemory()V

    iget-object v0, p0, L۟/c5;->ۥۡۦ:Landroid/webkit/WebView;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/webkit/WebView;->pauseTimers()V

    iget-object v0, p0, L۟/c5;->ۥۡۦ:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    return-void

    :cond_0
    invoke-static {v2}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v2}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    throw v1
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, L۟/gb;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_0

    const v0, 0x20008

    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    :cond_1
    new-instance p1, L۟/c5$b;

    invoke-direct {p1, p0}, L۟/c5$b;-><init>(L۟/c5;)V

    invoke-virtual {p0, p1}, L۟/gb;->ۥ۠ۡ(L۟/f3;)V

    iget-object p1, p0, L۟/c5;->ۥۡۥ:Landroid/widget/Button;

    if-eqz p1, :cond_2

    new-instance v0, L۟/q1;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p0}, L۟/q1;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_2
    const-string p1, "mBtnSearch"

    invoke-static {p1}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final ۥ۟ۦ()Ljava/util/List;
    .locals 13
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ResourceType",
            "SetJavaScriptEnabled"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/high16 v1, 0x42200000    # 40.0f

    .line 3
    .line 4
    invoke-static {v0, v1}, L۟/c4;->ۥۣ۟(IF)F

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    float-to-int v1, v1

    .line 9
    new-instance v2, Landroid/widget/LinearLayout;

    .line 10
    .line 11
    iget-object v3, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 12
    .line 13
    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 18
    .line 19
    .line 20
    new-instance v4, Landroid/widget/TextView;

    .line 21
    .line 22
    iget-object v5, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 23
    .line 24
    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 28
    .line 29
    const/4 v6, -0x2

    .line 30
    invoke-direct {v5, v6, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 34
    .line 35
    .line 36
    const-string v5, "\u5f5f\u5259\u4f59\u7f7a"

    .line 37
    .line 38
    invoke-static {v5}, L۟/jb;->ۥ۟۠(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    const/16 v5, 0x11

    .line 46
    .line 47
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 48
    .line 49
    .line 50
    const/high16 v7, 0x41700000    # 15.0f

    .line 51
    .line 52
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 53
    .line 54
    .line 55
    sget v8, L۟/ya;->ۥۣ۠:I

    .line 56
    .line 57
    invoke-virtual {v4, v8, v3, v8, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    new-instance v4, Landroid/widget/EditText;

    .line 64
    .line 65
    iget-object v9, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 66
    .line 67
    invoke-direct {v4, v9}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 68
    .line 69
    .line 70
    const/16 v9, 0x66

    .line 71
    .line 72
    invoke-virtual {v4, v9}, Landroid/view/View;->setId(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 76
    .line 77
    .line 78
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 79
    .line 80
    const/4 v10, -0x1

    .line 81
    invoke-direct {v9, v10, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 82
    .line 83
    .line 84
    const/high16 v11, 0x3f800000    # 1.0f

    .line 85
    .line 86
    iput v11, v9, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 87
    .line 88
    invoke-virtual {v4, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 92
    .line 93
    .line 94
    const-string v9, "\u8f9f\u5171\u7edb\u7eb8\u5eb2\uff18\u598eF,==?:?8>?:=@"

    .line 95
    .line 96
    invoke-static {v9}, L۟/jb;->ۥ۟۠(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    .line 103
    iput-object v4, p0, L۟/c5;->ۥۣۡ:Landroid/widget/EditText;

    .line 104
    .line 105
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 106
    .line 107
    .line 108
    new-instance v4, Landroid/widget/LinearLayout;

    .line 109
    .line 110
    iget-object v9, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 111
    .line 112
    invoke-direct {v4, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 116
    .line 117
    .line 118
    new-instance v9, Landroid/widget/TextView;

    .line 119
    .line 120
    iget-object v12, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 121
    .line 122
    invoke-direct {v9, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 123
    .line 124
    .line 125
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 126
    .line 127
    invoke-direct {v12, v6, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v9, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 131
    .line 132
    .line 133
    const-string v6, "\u573c\u574c\u6428\u7d2e"

    .line 134
    .line 135
    invoke-static {v6}, L۟/jb;->ۥ۟۠(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-virtual {v9, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v9, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v9, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v9, v8, v3, v8, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 152
    .line 153
    .line 154
    new-instance v6, Landroid/widget/EditText;

    .line 155
    .line 156
    iget-object v7, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 157
    .line 158
    invoke-direct {v6, v7}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 159
    .line 160
    .line 161
    const/16 v7, 0x6666

    .line 162
    .line 163
    invoke-virtual {v6, v7}, Landroid/view/View;->setId(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 167
    .line 168
    .line 169
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 170
    .line 171
    invoke-direct {v5, v10, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 172
    .line 173
    .line 174
    iput v11, v5, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 175
    .line 176
    invoke-virtual {v6, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 177
    .line 178
    .line 179
    const/high16 v5, 0x41500000    # 13.0f

    .line 180
    .line 181
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 182
    .line 183
    .line 184
    const-string v7, "\u8f9f\u5171\u573c\u574c\uff18\u598e\uff26\u5323\u4eb8"

    .line 185
    .line 186
    invoke-static {v7}, L۟/jb;->ۥ۟۠(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 191
    .line 192
    .line 193
    iput-object v6, p0, L۟/c5;->ۥۡۤ:Landroid/widget/EditText;

    .line 194
    .line 195
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 196
    .line 197
    .line 198
    new-instance v6, Landroid/widget/Button;

    .line 199
    .line 200
    iget-object v7, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 201
    .line 202
    invoke-direct {v6, v7}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 203
    .line 204
    .line 205
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 206
    .line 207
    sget v9, L۟/ya;->ۥ۠ۢ:I

    .line 208
    .line 209
    add-int/2addr v9, v1

    .line 210
    sub-int/2addr v1, v8

    .line 211
    invoke-direct {v7, v9, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 215
    .line 216
    .line 217
    const-string v1, "\u6428\u7d2e"

    .line 218
    .line 219
    invoke-static {v1}, L۟/jb;->ۥ۟۠(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 227
    .line 228
    .line 229
    iput-object v6, p0, L۟/c5;->ۥۡۥ:Landroid/widget/Button;

    .line 230
    .line 231
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 232
    .line 233
    .line 234
    new-instance v1, Landroid/webkit/WebView;

    .line 235
    .line 236
    iget-object v5, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 237
    .line 238
    invoke-direct {v1, v5}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 239
    .line 240
    .line 241
    const/16 v5, 0x666

    .line 242
    .line 243
    invoke-virtual {v1, v5}, Landroid/view/View;->setId(I)V

    .line 244
    .line 245
    .line 246
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 247
    .line 248
    invoke-direct {v5, v10, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 249
    .line 250
    .line 251
    iput v11, v5, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 252
    .line 253
    invoke-virtual {v1, v5}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 254
    .line 255
    .line 256
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    const/high16 v6, 0x41f00000    # 30.0f

    .line 265
    .line 266
    invoke-static {v0, v6, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    float-to-int v5, v5

    .line 271
    neg-int v5, v5

    .line 272
    invoke-virtual {v1, v3, v3, v3, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 280
    .line 281
    .line 282
    new-instance v5, L۟/c5$a;

    .line 283
    .line 284
    invoke-direct {v5, p0}, L۟/c5$a;-><init>(L۟/c5;)V

    .line 285
    .line 286
    .line 287
    const-string v7, "java_obj"

    .line 288
    .line 289
    invoke-virtual {v1, v5, v7}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    iget-object v5, p0, L۟/c5;->ۥۡۢ:Ljava/lang/String;

    .line 293
    .line 294
    const-string v7, "utf-8"

    .line 295
    .line 296
    invoke-static {v5, v7}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    const-string v8, "text/html"

    .line 301
    .line 302
    invoke-virtual {v1, v5, v8, v7}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    iput-object v1, p0, L۟/c5;->ۥۡۦ:Landroid/webkit/WebView;

    .line 306
    .line 307
    new-instance v1, Landroid/view/View;

    .line 308
    .line 309
    iget-object v5, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 310
    .line 311
    invoke-direct {v1, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 312
    .line 313
    .line 314
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 315
    .line 316
    invoke-static {v0, v6}, L۟/c4;->ۥۣ۟(IF)F

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    float-to-int v7, v7

    .line 321
    invoke-direct {v5, v10, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 322
    .line 323
    .line 324
    invoke-static {v0, v6}, L۟/c4;->ۥۣ۟(IF)F

    .line 325
    .line 326
    .line 327
    move-result v6

    .line 328
    float-to-int v6, v6

    .line 329
    neg-int v6, v6

    .line 330
    invoke-virtual {v5, v3, v6, v3, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 337
    .line 338
    .line 339
    const/4 v5, 0x4

    .line 340
    new-array v5, v5, [Landroid/view/View;

    .line 341
    .line 342
    aput-object v2, v5, v3

    .line 343
    .line 344
    aput-object v4, v5, v0

    .line 345
    .line 346
    iget-object v0, p0, L۟/c5;->ۥۡۦ:Landroid/webkit/WebView;

    .line 347
    .line 348
    if-eqz v0, :cond_0

    .line 349
    .line 350
    const/4 v2, 0x2

    .line 351
    aput-object v0, v5, v2

    .line 352
    .line 353
    const/4 v0, 0x3

    .line 354
    aput-object v1, v5, v0

    .line 355
    .line 356
    invoke-static {v5}, L۟/jb;->ۥ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    return-object v0

    .line 361
    :cond_0
    const-string v0, "mWebView"

    .line 362
    .line 363
    invoke-static {v0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    const/4 v0, 0x0

    .line 367
    throw v0
.end method
